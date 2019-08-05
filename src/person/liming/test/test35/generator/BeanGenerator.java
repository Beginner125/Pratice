package person.liming.test.test35.generator;

import person.liming.test.test35.database.databaseJava.Table;

import java.io.IOException;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 16:552019/8/5
 */
public interface BeanGenerator {

    //通过table生成Bean
    public void generateBean(Table table) throws IOException;

    //生成序列化id
    String generateBeanSerializeId();

    //生成类头
    String generateBeanClassHead(String tableName);

    //生成类尾
    String generateBeanClassTail();

    //生成get和set方法
    String generateBeanGetSet(String fieldType, String filedName);

    //生成toString方法
    String generateBeanToString(String[] fieldNames);

    //生成字段属性
    String generateBeanField(String fieldType, String fieldName);
}
