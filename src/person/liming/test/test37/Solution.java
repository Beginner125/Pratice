package person.liming.test.test37;



import person.liming.test.test37.state.StateManager;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuliming
 * @Description 用于写力扣上的答题代码
 * @Date: Created in 11:322019/8/25
 */
public class Solution {
    public static void main(String[] args) {
        People people = new People(StateManager.happyState);
        people.say();
        people.say();
        people.say();
        people.say();
        people.say();
    }
}
