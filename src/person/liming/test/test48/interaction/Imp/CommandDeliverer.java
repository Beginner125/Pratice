package person.liming.test.test48.interaction.Imp;

import person.liming.test.test48.interaction.Deliverer;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 16:042019/10/23
 */
public class CommandDeliverer implements Deliverer<String> {

    @Override
    public void deliver(String message) {
        System.out.println(message);
    }
}
