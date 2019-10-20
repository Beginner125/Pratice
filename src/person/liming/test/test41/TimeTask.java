package person.liming.test.test41;

import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.Callable;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 18:182019/10/3
 */
public class TimeTask implements Runnable {
    Queue<Ping> pingQueue;
    FileIO fileIO;
    int num = 0;

    public TimeTask(Queue<Ping> pingQueue, FileIO fileIO) {
        this.pingQueue = pingQueue;
        this.fileIO = fileIO;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (num < test41.num){
            if(pingQueue.peek() != null){
                Ping ping = pingQueue.peek();
                long rap = ((System.currentTimeMillis() - ping.beginTime)/1000);
                if(ping.beginTime != 0 &&  rap > (ping.pingTimes*ping.timeOut/1000)){
                    pingQueue.remove();
                    try {
                        ping.getResult();
                        if(ping.isFinsh && ping.connectedCount>0){
                            fileIO.saveLine(ping.getAddress()+"  "+ping.connectedCount+"%"+ping.pingTimes+"\n");
                        }
                        num++;
                        System.out.println("µÚ"+num+"¸öping");
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
