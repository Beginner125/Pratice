package person.liming.test.test33;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liuliming
 * @Description 用套接字获取http协议下发送的数据，并打印在控制台上。
 * @Date: Created in 22:402019/8/4
 */
public class Test33 {
    static ServerSocket serverSocket;
    private final int PORT = 8089;

    public static void main(String[] args) {
        InputStream inputStream = null;
        Reader reader = null;
        StringBuffer result = new StringBuffer();

        while (true){
            try {
                serverSocket = new ServerSocket(8089);
                Socket socket = serverSocket.accept();

                System.out.println("----接受到请求----");

                inputStream = socket.getInputStream();
                reader = new InputStreamReader(inputStream);

                char []bufferMeg = new char[100];
                System.out.println("----开始读消息----");
                while (reader.read(bufferMeg) != -1){
                    result.append(bufferMeg);//服务器接受不到消息会阻塞
                }
                System.out.println("---消息读取完毕---");
                System.out.println(result.toString());
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }

    }
}
