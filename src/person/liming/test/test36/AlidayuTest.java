package person.liming.test.test36;

import com.alibaba.fastjson.JSON;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 15:222019/8/6
 */
public class AlidayuTest {

    public static void main(String[] args) {

        String url = "http://gw.api.taobao.com/router/rest";

        String appKey = "23322204";

        String  appSecret = "5800e8a420d7dd8f3b277a014dbb11d4";

        String code =  "SMS_171851690";

        String signName = "葛洲坝贸发司OA";

        String name = "唐唐吃米饭2019";

        String type= "行政发文";

        String content = "项目进行进度";

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name",name);
        map.put("type",type);
        map.put("content",content);

        String jsonString = JSON.toJSONString(map);


        TaobaoClient client = new DefaultTaobaoClient(url,appKey , appSecret);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        req.setExtend("123456");
        req.setSmsType("normal");
        req.setSmsFreeSignName(signName);
        req.setSmsParamString(jsonString);
        req.setRecNum("15572710708");
        req.setSmsTemplateCode(code);
        AlibabaAliqinFcSmsNumSendResponse rsp = null;
        try {
            rsp = client.execute(req);

            System.out.println(rsp.getBody());

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public static String stringToUnicode(String str) {
        StringBuffer sb = new StringBuffer();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            sb.append("\\u" + Integer.toHexString(c[i]));
        }
        return sb.toString();
    }
}
