package person.liming.test.test48.execution.Imp.context;

import person.liming.test.test48.execution.Executor;
import person.liming.test.test48.execution.Imp.executor.Imp.*;
import person.liming.test.test48.function.SuperRobot;

import java.awt.*;
import java.util.*;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 19:432019/10/23
 */
public class GlobalContext extends Context {

    public static Map<String, Executor> parseRule = new HashMap();
    public static SuperRobot superRobot = null;
    public static Map<String, String> functions = new HashMap<>();
    public static Map<String, String> images = new HashMap<>();
    public static Queue<String> cmdHistory = new ArrayDeque<>();
    static {
        try {
            superRobot = new SuperRobot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        parseRule.put("mousemove +(\\d+,\\d+)", new MouseMoveExecutor());//鼠标移动
        parseRule.put("mousemove +(useimg +\\w+)", new MouseMoveExecutor());//鼠标到指定图标
        parseRule.put("automap", null);//非命令模式
        parseRule.put("usescript +.+\\.txt", new ScriptExecutor());//使用脚本
        parseRule.put("(\\w|,| )+;(\\w|,| )+", new ComplieBatExecutor());//批量执行功能
        parseRule.put("keyinput +\\w+", new KeyInputExecutor());//输入键盘按键
        parseRule.put("sclick *", new SingleCmdExecutor());//鼠标单击
        parseRule.put("dclick *", new SingleCmdExecutor());//鼠标双击
        parseRule.put("history *", new SingleCmdExecutor());//鼠标双击
        parseRule.put("(addfunc +\\w+ +\\(.+\\))|(usefunc +\\w+)|(findfunc +\\w+)|(delfunc +\\w+)|(modfunc +\\w+ +\\(.+\\))|(listfunc)", new FuncCurdExecutor());//保存函数
        parseRule.put("(addimg +\\w+ +\\(.+\\))|(useimg +\\w+)|(findimg +\\w+)|(delimg +\\w+)|(modimg +\\w+ +\\(.+\\))|(listimg)", new ImgCurdExecutor());//保存函数
        parseRule.put("exit *", new SingleCmdExecutor());//离开程序
        parseRule.put("help *", new SingleCmdExecutor());//帮助文档
        parseRule.put("sleep \\d+", new SleepExecutor());//停止n秒
        parseRule.put("!.+", new SysCmdExecutor());
    }
}
