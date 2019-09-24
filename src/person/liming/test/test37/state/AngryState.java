package person.liming.test.test37.state;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 22:342019/9/5
 */
public class AngryState extends AbstractPeopleState {

    @Override
    public PeopleState speak() {
        logger.info("Fuck you!!!Don't tunch me!");
        return StateManager.sadState;
    }

}
