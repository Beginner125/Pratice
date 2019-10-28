package person.liming.test.test48.utils;

import person.liming.test.test48.execution.Imp.context.GlobalContext;

import java.util.Map;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 14:302019/10/27
 */
public class Operation {
    Map<String, String> funcs;
    public boolean persistFunc(){
        return true;
    }

    public Operation(Map<String, String> funcs) {
        this.funcs = funcs;
    }

    public boolean has(String name){
        funcs = GlobalContext.functions;
        return funcs.get(name)==null?false:true;
    }

    public void save(String funcName, String funcContent){
        funcs.put(funcName, funcContent);
    }

    public void remove(String funcName){
        funcs.remove(funcName);
    }

    public String get(String funcName){
        return funcs.get(funcName);
    }

    public String listString(){
        StringBuilder string = new StringBuilder();
        for (String name:
                funcs.keySet()) {
            string.append(name+"\t").append(funcs.get(name)).append("\n");
        }
        return string.toString();
    }
}
