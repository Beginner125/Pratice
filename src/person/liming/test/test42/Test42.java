package person.liming.test.test42;

import java.util.Stack;
import java.util.concurrent.*;

/**
 * @author liuliming
 * @Description 使用线程池写一个生产者与消费者的问题
 * @Date: Created in 18:332019/9/30
 */
public class Test42 {
    public static void main(String[] args) throws InterruptedException {
        Stack<String> stringStack = new Stack<String>();
        ArrayBlockingQueue blockingDeque = new ArrayBlockingQueue<Object>(5);
        Creator creator = new Creator(stringStack);
        Customer customer = new Customer(stringStack);
        InstantCreateTask instantCreateTask = new InstantCreateTask(creator);
        InstantCustomTask instantCustomTask = new InstantCustomTask(customer);
        ExecutorService executorService = new ThreadPoolExecutor(2, 5, 1000, TimeUnit.SECONDS, blockingDeque);
        executorService.submit(instantCustomTask);
        executorService.submit(instantCreateTask);
    }
}

class InstantCreateTask implements Callable{

    Creator creator;

    public InstantCreateTask(Creator creator) {
        this.creator = creator;
    }

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            creator.create();
        }
        return null;
    }
}

class InstantCustomTask implements Callable{

    Customer customer;

    public InstantCustomTask(Customer customer) {
        this.customer = customer;
    }


    @Override
    public Object call() throws Exception {
        for(int i = 0; i < 10; i++){
            customer.custom();
        }
        return null;
    }
}