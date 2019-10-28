package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Imp.context.Context;
import person.liming.test.test48.execution.Imp.context.StringContext;
import person.liming.test.test48.execution.Imp.executor.AbstractRobotExecutor;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;
import person.liming.test.test48.interaction.Imp.CommandDeliverer;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 17:072019/10/26
 */
public class SysCmdExecutor extends AbstractRobotExecutor {
    CommandDeliverer commandDeliverer = new CommandDeliverer();
    @Override
    protected ExecuteResult specificExecute() {
        Runtime runtime = Runtime.getRuntime();
        StringContext stringContext = (StringContext)context;
        try {
            Process process = runtime.exec(stringContext.getString());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String text;
            while ((text = bufferedReader.readLine()) != null){
                commandDeliverer.deliver(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new StringExecuteResult("Ö´ÐÐÍê±Ï");
    }

    @Override
    public Context parse(String param) {
        param = param.substring(1, param.length());
        return new StringContext(param);
    }
}
