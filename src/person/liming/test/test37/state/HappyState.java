package person.liming.test.test37.state;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 22:372019/9/5
 */
public class HappyState extends AbstractPeopleState {
    @Override
    public PeopleState speak() {
        logger.info("hhhh! I'm so good!");
        return StateManager.angryState;
    }
}
