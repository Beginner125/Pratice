package person.liming.test.test21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author liuliming
 * 用TCP协议写一个客户端和一个服务端，实现上传文件
 */
public class ServerClient {
	//上传字节缓冲
	private static final int BUFFER_SIZE = 10;
	//套接字
	ServerSocket ss;
	//传来的文件放到的地方
	File file;
	//客户端的消息
	String news;
	
	public void listen(int port) throws IOException{
		//变量声明
		String str;
		Scanner scan = new Scanner(System.in);
		Socket socket = null;
		OutputStream out;

		//输入文件传输目的地
		System.out.println("输入文件传输目的地");
		str = scan.next();
		file = new File(str);

		if(!file.exists()){
			file.createNewFile();
		}
		out = new FileOutputStream(file);

		ss = new ServerSocket(port);
		socket = ss.accept();

		//获得连接
		System.out.println("获得连接, 等待传输文件");
		InputStream in = socket.getInputStream();
		byte[] buffer = new byte[BUFFER_SIZE];
		int flag;

		System.out.println("开始传输文件");
		while(true){
			while( (flag = in.read(buffer)) != -1 ){
				out.write(buffer);
			}
			try{
			      socket.sendUrgentData(0xFF);
			}catch(Exception ex){
			      break;
			}
		}
		
		System.out.println("文件传输成功，传输目的地"+file.getAbsolutePath());
	}
	
}
