package person.liming.test.test21;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;


public class Client {
	//上传字节缓冲
	private static final int BUFFER_SIZE = 10;
	//待上传的文件
	File file;
	//连接套接字
	Socket socket;
	//服务端传来的消息
	String news;
	
	
	public void getFile() {
		
		String str;
		Scanner scan = new Scanner(System.in);
		
		//选择文件
		while(true){
			System.out.println("请输入路径查看文件");
			str = scan.next();
			file = new File(str);
			System.out.println(Arrays.toString(file.list()));
			
			System.out.println("请输入当前路径文件名，输入next重新查看路径并选择");
			str = scan.next();
			
			//next跳出
			if(!str.equals("next")){
				
				//非no跳出
				while(true){
					file = new File(str);
					System.out.println("你输入的是"+file.getAbsolutePath());
					System.out.println("输入no，重新选择");
					
					str = scan.next();
					if(!str.equals("no")){
						break;
					}
				}
				
				break;
			}
		}
	}
	
	public void subFile() throws IOException{
		OutputStream out = socket.getOutputStream();
		InputStream in = new FileInputStream(file);
		byte[] bufferByte = new byte[BUFFER_SIZE];
		int flag;
		
		//传输文件
		System.out.println("传输文件开始");
		
		while((flag = in.read(bufferByte)) != -1){
			out.write(bufferByte);
		}
		
		System.out.println("传输文件完成");
		in.close();
		out.close();
	}
	
	public void getConnect(String host, int port) throws UnknownHostException, IOException{
		socket = new Socket(host, port);
	}
	
	public void disConnect() throws IOException{
		socket.close();
	}
	
}
