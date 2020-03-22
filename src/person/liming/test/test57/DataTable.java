package person.liming.test.test57;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 12:012020/3/14
 */
public class DataTable {
    String tableName;
    ArrayList<DataTableCol> tableCols;

    public DataTable(String tableName, ArrayList<DataTableCol> tableCols) {
        this.tableName = tableName;
        this.tableCols = tableCols;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ArrayList<DataTableCol> getTableCols() {
        return tableCols;
    }

    public void setTableCols(ArrayList<DataTableCol> tableCols) {
        this.tableCols = tableCols;
    }

    @Override
    public String toString() {
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < tableCols.size()-1; i++) {
            content.append(tableCols.get(i).toString()).append(",");
        }
        content.append(tableCols.get(tableCols.size()-1).toString()).append("\n");

        return "create table "+tableName+"(\n"+content.toString()+");";
    }
}
