package person.liming.test.test37;

import person.liming.test.test37.state.PeopleState;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 22:312019/9/5
 */
public class People {
    private PeopleState state;

    public People(PeopleState state) {
        this.state = state;
    }

    public void say(){
        state = state.speak();
    }


}
