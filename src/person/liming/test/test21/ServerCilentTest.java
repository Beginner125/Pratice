package person.liming.test.test21;

import java.io.IOException;

/**
 * @author liuliming
 * 用TCP协议写一个客户端和一个服务端，实现上传文件
 */
public class ServerCilentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerClient sc = new ServerClient();
		try {
			sc.listen(8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
