package person.liming.test.test41;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuliming
 * @Description 写一个文本数据分析工具，分为数据采集，数据分析，数据分析结果持久化，数据分析结果展示四个结构，
 * @Date: Created in 16:422019/9/24
 */
public class test41 {

    static FileIO fileIO;
    static ExecutorService executorService;
    static Queue<Ping> pingQueue;
    static String[] address;
    static int num = 256;
    static {
        try {
            fileIO = new FileIO("validAddress.txt");
            executorService = Executors.newScheduledThreadPool(3);
            pingQueue = new ConcurrentLinkedQueue<Ping>();
            address = new String[num];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

//        int add1 = (int) (Math.random()*255);
//        int add2 = (int) (Math.random()*255);
//        int add3 = (int) (Math.random()*255);
//        String address123 = add1+"."+add2+"."+add3+".";
        String address123 = "182.128.0.";

        for (int j = 0; j < 256; j++) {
            address[j] = address123+j;
        }
        executorService.submit(new PingTask(address, pingQueue));
        executorService.submit(new TimeTask(pingQueue, fileIO));
        executorService.shutdown();

    }
}
