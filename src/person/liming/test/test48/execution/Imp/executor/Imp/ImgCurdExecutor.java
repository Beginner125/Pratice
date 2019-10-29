package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Imp.context.Context;
import person.liming.test.test48.execution.Imp.context.CurdContext;
import person.liming.test.test48.execution.Imp.context.GlobalContext;
import person.liming.test.test48.execution.Imp.executor.AbstractCurdExecutor;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;
import person.liming.test.test48.parse.Imp.CmdExecuteParser;
import person.liming.test.test48.utils.Operation;

import java.awt.image.BufferedImage;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 9:192019/10/28
 */
public class ImgCurdExecutor extends AbstractCurdExecutor {
    Operation operation;

    public ImgCurdExecutor() {
        super();
        operation = new Operation(GlobalContext.images);
    }

    @Override
    public ExecuteResult add() {
        operation.save(curdContext.getName(), curdContext.getContent());
        StringExecuteResult result = new StringExecuteResult("执行操作成功");
        return result;
    }

    @Override
    public ExecuteResult mod() {
        operation.save(curdContext.getName(), curdContext.getContent());
        StringExecuteResult result = new StringExecuteResult("执行操作成功");
        return result;
    }

    @Override
    public ExecuteResult del() {
        operation.remove(curdContext.getName());
        StringExecuteResult result = new StringExecuteResult("执行操作成功");
        return result;
    }

    @Override
    public ExecuteResult find() {
        StringExecuteResult result = new StringExecuteResult("该函数命令如下\n"+operation.get(curdContext.getName()));
        return result;
    }

    @Override
    public ExecuteResult use() {
        String content = operation.get(curdContext.getName());
        return new StringExecuteResult(content);
    }

    @Override
    public ExecuteResult list() {
        StringExecuteResult result = new StringExecuteResult(operation.listString());
        return result;
    }

    @Override
    public Context parse(String param) {
        String[] temp = param.split(" +", 3);
        CurdContext context = null;
        switch (temp[0]){
            case "addimg":
                context = new CurdContext(CurdContext.CURD.add, temp[1], temp[2].substring(1, temp[2].length()-1));
                return context;
            case "delimg":
                context = new CurdContext(CurdContext.CURD.del, temp[1], null);
                return context;
            case "findimg":
                context = new CurdContext(CurdContext.CURD.find, temp[1], null);
                return context;
            case "modimg":
                context = new CurdContext(CurdContext.CURD.mod, temp[1], temp[2].substring(1, temp[2].length()-1));
                return context;
            case "useimg":
                context = new CurdContext(CurdContext.CURD.use, temp[1], null);
                return context;
            case "listimg":
                context = new CurdContext(CurdContext.CURD.list, null, null);
                return context;
        }

        return context;
    }
}
