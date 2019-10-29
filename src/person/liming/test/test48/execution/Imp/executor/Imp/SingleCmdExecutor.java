package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Imp.context.GlobalContext;
import person.liming.test.test48.execution.Imp.executor.AbstractRobotExecutor;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;
import person.liming.test.test48.execution.Imp.context.StringContext;

import java.util.Queue;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 19:482019/10/23
 */
public class SingleCmdExecutor extends AbstractRobotExecutor {

    @Override
    protected ExecuteResult specificExecute() {
        StringContext stringContext = (StringContext)context;
        String string = stringContext.getString();
        StringBuilder stringBuilder;
        switch (string){
            case "sclick":
                superRobot.singleClick();
                break;
            case "dclick":
                superRobot.doubleClick();
                break;
            case "exit":
                System.exit(0);
                break;
            case "history":
                Queue<String> queue = GlobalContext.cmdHistory;
                stringBuilder = new StringBuilder();
                int i = 0;
                for (String s :
                        queue) {
                    stringBuilder.append(i).append(": ").append(s).append("\n");
                    i++;
                }
                return new StringExecuteResult(stringBuilder.toString());
            case "help":
                return new StringExecuteResult("以下是所有的命令\n" +
                        "移动鼠标示例 mousemove 100,100\n" +
                        "单击鼠标左键 sclick\n" +
                        "双击鼠标左键 dclick\n" +
                        "输入按键示例 keyinput abcdefg\n" +
                        "\n" +
                        "显示历史命令 history\n" +
                        "批量执行命令 mousemove 100,100;sclick\n" +
                        "\n" +
                        "使用脚本示例 usescript F:\\TempraryFile\\supermove.txt\n" +
                        "休眠3秒示例  sleep 3000\n" +
                        "执行cmd命令示例 !ping 127.0.0.1\n" +
                        "退出程序 exit\n" +
                        "\n" +
                        "增添函数示例 addfunc move (mousemove 100,100;sclick)\n" +
                        "使用函数示例 usefunc move\n" +
                        "删除函数示例 delfunc move\n" +
                        "修改函数示例 modfunc btn (mousemove 100,100;dclick)\n" +
                        "\n" +
                        "增添图片示例 addimg btn (F:\\TempraryFile\\btn.jpg)\n" +
                        "使用图片示例 mousemove useimg btn\n" +
                        "删除图片示例 delimg btn\n" +
                        "修改图片示例 modimg btn (F:\\TempraryFile\\btn.jpg)\n");
        }
        return new StringExecuteResult("执行"+string+"命令成功");
    }

    @Override
    public StringContext parse(String param) {
        return new StringContext(param.trim());
    }
}
