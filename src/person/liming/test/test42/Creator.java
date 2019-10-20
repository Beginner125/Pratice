package person.liming.test.test42;

import java.util.Stack;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 18:342019/9/30
 */
public class Creator {
    Stack<String> strings;

    public Creator(Stack<String> strings) {
        this.strings = strings;
    }

    public synchronized void create() throws InterruptedException {
        if(strings.size() == 10){
            wait();
        }
        System.out.println("生产产品");
        this.strings.push(Thread.currentThread().getName()+":产品T800");
    }
}
