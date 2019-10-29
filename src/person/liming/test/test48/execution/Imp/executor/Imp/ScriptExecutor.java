package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.Executor;
import person.liming.test.test48.execution.Imp.context.BatContext;
import person.liming.test.test48.execution.Imp.context.Context;
import person.liming.test.test48.execution.Imp.context.StringContext;
import person.liming.test.test48.parse.Imp.CmdExecuteParser;

import java.io.*;
import java.nio.file.NoSuchFileException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 10:292019/10/28
 */
public class ScriptExecutor extends ParseBatExecutor {

    @Override
    public Context parse(String param) {
        String filePath = param.split(" ", 2)[1];
        File file = new File(filePath);
        if(!file.exists()){
            try {
                throw new NoSuchFileException(filePath);
            } catch (NoSuchFileException e) {
                e.printStackTrace();
            }
        }
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            Queue<String> strings = new ConcurrentLinkedDeque<>();
            String cmd;
            while ((cmd = reader.readLine()) != null){
                strings.add(cmd);
            }
            String[] strings1 = new String[strings.size()];
            strings.toArray(strings1);
            return new StringContext(strings1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
