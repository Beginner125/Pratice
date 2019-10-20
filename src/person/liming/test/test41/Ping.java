package person.liming.test.test41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 9:462019/10/3
 */
public class Ping {
    int pingTimes = 4;
    int timeOut = 3000;
    long beginTime = 0;
    String address1;
    String address2;
    String address3;
    String address4;

    static Logger log = Logger.getLogger(Ping.class.getName());

    boolean isFinsh = false;
    int connectedCount = 0;
    List<String> connectedMegs = new ArrayList<String>();
    private BufferedReader in;


    public Ping(String address) throws Exception {
        String[] adds = address.split("\\.");
        if(adds.length < 4){
            throw new Exception("参数错误");
        }
        address1 = adds[0];
        address2 = adds[1];
        address3 = adds[2];
        address4 = adds[3];
    }

    public void ping() throws IOException{
        Runtime runtime = Runtime.getRuntime();
        String pingCmd = "ping "+getAddress()+ " -n " + pingTimes + " -w " + timeOut;
        log.info("开始ping："+pingCmd);
        Process process = runtime.exec(pingCmd);
        if(process == null){
            throw new RuntimeException("运行进程为空，请检查命令和运行环境");
        }
        beginTime = System.currentTimeMillis();
        in = new BufferedReader(new InputStreamReader(process.getInputStream()));
    }

    public void getResult() throws IOException {
        String line = null;
        while ((line = in.readLine()) != null){
            connectedCount += getCheckResult(line);
            connectedMegs.add(line);
        }
        log.info("结束ping "+getAddress()+" ："+connectedCount);
        in.close();
        isFinsh = true;
    }

    private int getCheckResult(String line) {  // System.out.println("控制台输出的结果为:"+line);
        Pattern pattern = Pattern.compile("(\\d+ms)(\\s+)(TTL=\\d+)",    Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            return 1;
        }
        return 0;
    }

    public String getAddress(){
        return  address1+'.'+address2+'.'+address3+'.'+address4;
    }
}
