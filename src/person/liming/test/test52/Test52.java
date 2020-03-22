package person.liming.test.test52;

/**
 * @author liuliming
 * @Description 写一个有限状态机，该状态机能够接受像 a+b=c a-b<c a*b>c 这样的数学等式
 * @Date: Created in 12:442019/11/25
 */
public class Test52 {
    public static void main(String[] args) {
        StateMachine stateMachine = new StateMachine();
        System.out.println(stateMachine.jugleInput("1-10=199"));
    }
}
