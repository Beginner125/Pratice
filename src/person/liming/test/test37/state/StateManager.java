package person.liming.test.test37.state;

import person.liming.test.test37.People;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 22:322019/9/5
 */
public class StateManager {
    public static PeopleState sadState ;
    public static PeopleState angryState;
    public static PeopleState happyState;
    static {
        sadState = new SadState();
        angryState = new AngryState();
        happyState = new HappyState();
    }
}
