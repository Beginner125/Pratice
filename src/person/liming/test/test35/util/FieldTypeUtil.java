package person.liming.test.test35.util;

import java.util.HashMap;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 15:172019/8/5
 */
public class FieldTypeUtil {
    static HashMap<String, String> typeMapping;

    static {
        typeMapping = new HashMap<String, String>();
        typeMapping.put("varchar", "String");
        typeMapping.put("int", "int");
    }

    public static String toJavaType(String type){
        return typeMapping.get(type.toLowerCase());
    }

    public static void addTypeMap(String sqlType, String mappingType){
        typeMapping.put(sqlType, mappingType);
    }

}
