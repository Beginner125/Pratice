package person.liming.test.test35;

import person.liming.test.test35.Config.Configurer;
import person.liming.test.test35.database.DatabaseConnector;
import person.liming.test.test35.database.databaseJava.Table;
import person.liming.test.test35.generator.BeanGenerator;
import person.liming.test.test35.generator.generatorImpl.JavaBeanGenerator;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author liuliming
 * @Description 根据数据库生成bean文件
 * @Date: Created in 13:322019/8/5
 */
public class Test35 {

    public static void main(String[] args) {
        try {
//            //获取配置文件
//            Configurer.getInstance().getConfigureFile("file/beanGenerator.properties");
            //设置配置文件
            Configurer.getInstance().setConfigurerFile("file/beanGenerator.properties");
            //获取数据库连接器
            DatabaseConnector database = new DatabaseConnector();
            //数据库连接q_question表
            Table table = database.getTables("question");
            //创建生成器
            BeanGenerator generator = new JavaBeanGenerator();
            //生成bean文件
            generator.generateBean(table);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
