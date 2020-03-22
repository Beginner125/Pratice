package person.liming.test.test57;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 12:022020/3/14
 */
public class DataTableCol {
    String name;
    String type;
    String isNull;
    String note;

    public DataTableCol() {
    }

    public DataTableCol(String name, String type, String isNull, String note) {
        this.name = name;
        this.type = type;
        this.isNull = isNull;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsNull() {
        return isNull;
    }

    public void setIsNull(String isNull) {
        this.isNull = isNull;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        if(isNull == null){
            return "";
        }
        String reType;
        if (type.equalsIgnoreCase("varchar")){
            reType = type+"(100)";
        }else if (type.equalsIgnoreCase("int")){
            reType = type+"(30)";
        }else{
            reType = type+"(6)";
        }
        return name + " " + reType+ " "+(isNull.equalsIgnoreCase("null")?"":isNull)+" comment '"+note+"'";
    }
}
