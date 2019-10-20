package person.liming.test.test41;

import org.slf4j.Logger;

import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.Callable;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 10:052019/10/3
 */
public class PingTask implements Callable {
    Ping[] ping;
    Queue<Ping> pingQueue;


    public PingTask(String[] address, Queue<Ping> pingQueue) {
        try {
            ping = new Ping[address.length];
            for (int i = 0; i < address.length; i++) {
                ping[i] = new Ping(address[i]);
            }
            this.pingQueue = pingQueue;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public Object call() throws Exception {
        for (int i = 0; i < ping.length; i++) {
            try {
                ping[i].ping();
                pingQueue.add(ping[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
