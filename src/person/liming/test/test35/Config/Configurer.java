package person.liming.test.test35.Config;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 17:292019/8/5
 */
public class Configurer {

    HashMap<String, Object> configParam;

    static Configurer configurer;

    private Configurer(){
        init();
    }

    private void init(){
        configParam = new HashMap<String, Object>();
        configParam.put("URL", "jdbc:mysql://127.0.0.1:3306/");
        configParam.put("DATABASE", "questions");
        configParam.put("PERT", "?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT");
        configParam.put("USER", "root");
        configParam.put("PWD", "root");
        configParam.put("DRIVER", "com.mysql.cj.jdbc.Driver");
        configParam.put("PATH", "file/");
        configParam.put("SUFFIX", ".java");
    }

    public static Configurer getInstance(){
        if (configurer == null){
            configurer = new Configurer();
        }
        return configurer;
    }

    public void getConfigureFile(String pathFile) throws IOException {

        File file = new File(pathFile);
        BufferedWriter writer;
        if(!file.exists()){
            file.createNewFile();
        }
        writer = new BufferedWriter(new FileWriter(file));

        for(String s:configParam.keySet()){
            writer.write(s);
            writer.write("=");
            writer.write((String)configParam.get(s));
            writer.newLine();
        }

        writer.close();
    }

    public void setConfigurerFile(String pathFile) throws IOException {
        File file = new File(pathFile);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "utf-8");
        Properties prop = new Properties();
        prop.load(reader);
        for(String s:configParam.keySet()){
            configParam.put(s, prop.getProperty(s));
        }
    }

    public Object getParam(String name){
        return configParam.get(name);
    }

    @Override
    public String toString() {
        return configParam.toString();
    }
}
