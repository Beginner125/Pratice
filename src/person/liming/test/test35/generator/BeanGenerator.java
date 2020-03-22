package person.liming.test.test35.generator;

import person.liming.test.test35.database.databaseJava.Table;

import java.io.IOException;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 16:552019/8/5
 */
public interface BeanGenerator {

    /**
     * 通过table生成Bean
     * */
    public void generateBean(Table table) throws IOException;

    //生成类名
    String generateBeanClassName(String tableName);

    //生成get和set方法
    String generateBeanGetSet(String fieldType, String filedName);

    //生成toString方法
    String generateBeanToString(String[] fieldNames);

    //生成字段属性
    String generateBeanField(String fieldType, String fieldName);
}
