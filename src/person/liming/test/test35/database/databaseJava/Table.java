package person.liming.test.test35.database.databaseJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 13:342019/8/5
 */
public class Table {
    //表的属性名，属性名对映的类型，大小，是否主键。
    List<HashMap<String, String>> columns;
    //表的名称
    String tableName;

    public Table(){
        columns = new ArrayList<HashMap<String, String>>();
    }

    public void addColumn(HashMap<String, String> column){
        columns.add(column);
    }

    public Map<String, String> getColumn(int index){
        return columns.get(index);
    }

    public List<HashMap<String, String>> getColumns() {
        return columns;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        StringBuffer re = new StringBuffer();
        for(HashMap<String ,String> column:columns){
            re.append(column.toString());
            re.append("\n");
        }
        return re.toString();
    }
}