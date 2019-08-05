package person.liming.test.test31;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @author liuliming
 * Description 写一个使用log4j的示例程序
 * Date: Created in 13:252019/8/3
 */
public class Test31 {

    //获得要打印的类名
    static Logger log = Logger.getLogger(
            Test31.class.getName());

    public static void main(String[] args) {
        log.info("Info Message!");
        log.debug("nonono");
    }

}
