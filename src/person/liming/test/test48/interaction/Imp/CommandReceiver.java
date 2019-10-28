package person.liming.test.test48.interaction.Imp;

import person.liming.test.test48.execution.Imp.context.GlobalContext;
import person.liming.test.test48.interaction.Receiver;

import java.util.Queue;
import java.util.Scanner;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 15:572019/10/23
 */
public class CommandReceiver implements Receiver<String> {
    Scanner scanner;

    CommandReceiver(){
        scanner = new Scanner(System.in);
    }

    @Override
    public String receive() {
        String string = scanner.nextLine();
        Queue<String> cmdHistory = GlobalContext.cmdHistory;
        if(cmdHistory.size() > 20){
            cmdHistory.poll();
        }
        cmdHistory.add(string);
        return string;
    }

}
