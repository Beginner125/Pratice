package person.liming.test.test37.state;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 22:332019/9/5
 */
public class SadState extends AbstractPeopleState {

    @Override
    public PeopleState speak() {
        logger.info("Oh no! why so cool for me");
        return StateManager.happyState;
    }

}
