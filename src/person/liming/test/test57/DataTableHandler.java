package person.liming.test.test57;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 11:592020/3/14
 */
public class DataTableHandler extends DefaultHandler {
    HashMap<String, DataTable> tableHashMap = new HashMap<>();
    DataTableCol bufferTableCol = new DataTableCol();
    String bufferTableName;
    boolean bColumn = false;
    boolean bName = false;
    boolean bType = false;
    boolean bNull = false;
    boolean bNote = false;
    boolean isOver = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equalsIgnoreCase("table" )){
            if(attributes.getValue("name") == null){
                isOver = true;
                return;
            }else {
                isOver = false;
            }
            bufferTableName = attributes.getValue("name");
            bufferTableName = bufferTableName.replaceAll(".+\\(", "");
            bufferTableName = bufferTableName.replaceAll("\\)", "");
            System.out.println("tableName:" + bufferTableName);
        }else if(qName.equalsIgnoreCase("column")){
            bColumn = true;
        }else if(qName.equalsIgnoreCase("name")){
            bName = true;
        }else if(qName.equalsIgnoreCase("type")){
            bType = true;
        }else if(qName.equalsIgnoreCase("null")){
            bNull = true;
        }else if(qName.equalsIgnoreCase("note")){
            bNote = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(isOver){
            return;
        }
        if(qName.equalsIgnoreCase("column")){
            bColumn = false;
            if(tableHashMap.get(bufferTableName) == null){
                ArrayList list = new ArrayList<DataTableCol>();
                list.add(bufferTableCol);
                DataTable dataTable = new DataTable(bufferTableName, list);
                tableHashMap.put(bufferTableName, dataTable);
            }else {
                DataTable dataTable = tableHashMap.get(bufferTableName);
                dataTable.getTableCols().add(bufferTableCol);
            }
            bufferTableCol = new DataTableCol();
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(isOver){
            return;
        }
        if(bName){
            System.out.println("bName:" + new String(ch, start, length));
            bufferTableCol.setName(new String(ch, start, length));
            bName = false;
        }else if(bType){
            System.out.println("bType:" + new String(ch, start, length));
            bufferTableCol.setType(new String(ch, start, length));
            bType = false;
        }else if(bNull){
            System.out.println("bNull:" + new String(ch, start, length));
            bufferTableCol.setIsNull(new String(ch, start, length));
            bNull = false;
        }else if(bNote){
            System.out.println("bNote:" + new String(ch, start, length));
            bufferTableCol.setNote(new String(ch, start, length));
            bNote = false;
        }
    }

    public HashMap<String, DataTable> getTableHashMap() {
        return tableHashMap;
    }
}
