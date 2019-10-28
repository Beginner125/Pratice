package person.liming.test.test48.interaction.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Executor;
import person.liming.test.test48.interaction.Interactor;
import person.liming.test.test48.parse.Imp.CmdExecuteParser;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 16:062019/10/23
 */
public class CommandInteractor implements Interactor {
    CommandReceiver receiver;
    CommandDeliverer deliverer;
    Executor executor;
    CmdExecuteParser parser;

    public CommandInteractor() {
        receiver = new CommandReceiver();
        deliverer = new CommandDeliverer();
        parser = new CmdExecuteParser();
    }

    @Override
    public void run() {
        while (true){
            executor = parser.parse(receiver.receive());
            ExecuteResult result = executor.execute();
            deliverer.deliver(result.toString());
        }
    }
}
