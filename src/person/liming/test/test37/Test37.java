package person.liming.test.test37;



import person.liming.test.test37.state.StateManager;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuliming
 * @Description 写一个类，使用状态模式，该类每次调用一个方法后会改变状态，之后该方法的调用效果会改变。
 * @Date: Created in 11:322019/8/25
 */
public class Test37 {
    public static void main(String[] args) {
        People people = new People(StateManager.happyState);
        people.say();
        people.say();
        people.say();
        people.say();
        people.say();
    }
}
