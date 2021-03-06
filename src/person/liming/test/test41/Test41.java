package person.liming.test.test41;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuliming
 * @Description 使用系统的ping功能，使用多线程遍历指定范围的ip地址，将能够ping通的地址保存下来
 * @Date: Created in 16:422019/9/24
 */
public class Test41 {

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
        executorService.submit(new PingTask(address, pingQueue));//一口气执行所有ping任务
        executorService.submit(new TimeTask(pingQueue, fileIO));//对ping任务计时，超时后后将结果存入文件，并结束该ping任务
        executorService.shutdown();

    }
}
