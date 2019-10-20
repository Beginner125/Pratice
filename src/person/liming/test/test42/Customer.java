package person.liming.test.test42;

import java.util.Stack;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 18:342019/9/30
 */
public class Customer {
    Stack<String> strings;

    public Customer(Stack<String> strings) {
        this.strings = strings;
    }

    public synchronized String custom() throws InterruptedException {
        String s;
        while (strings.empty()){
        }
        s = strings.pop();
        System.out.println("消费产品");
        System.out.println(Thread.currentThread().getName()+":"+s);
        return s;
    }
}
