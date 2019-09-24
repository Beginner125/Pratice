package person.liming.test.test36;

import com.squareup.okhttp.*;

import java.io.IOException;


/**
 * @author liuliming
 * @Description 使用okhttp获取接口数据
 * @Date: Created in 10:542019/8/6
 */
public class Test36 {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), "{\"bimRequestId\":\"1\",\"bimRemoteUser\":\"admin\",\"bimRemotePwd\":\"123456\"}");

//        RequestBody requestBody = new FormEncodingBuilder()
//                .add("bimRequestId", "1")
//                .add("bimRemoteUser", "admin")
//                .add("bimRemotePwd", "123456")
//                .build();
        String child = "SchemaService";

        Request request = new Request.Builder()
                .url("http://10.201.185.61:8080/a/bimConnect/bimEntity/"+child)
                .post(requestBody)
                .build();

        Response response = client.newCall(request).execute();

        if(!response.isSuccessful()){
            throw new IOException("服务器端错误: " + response);
        }

        System.out.println(response.body().string());
    }

}
