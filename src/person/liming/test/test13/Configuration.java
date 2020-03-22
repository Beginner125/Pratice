package person.liming.test.test13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	private final String FONT;
	private final String COLOR;
	private final int RANGE;
	
	private static Configuration ConfigInstance;
	
	private Configuration() throws IOException {
		Properties pro = new Properties();
		File file = new File("file/class.properties");
		InputStream in;
		
		if(!file.exists()){
			file.createNewFile();
		}
		
		//≥ı ºªØ
		in = new FileInputStream(file);
		pro.load(in);
		
		//ªÒ»°≈‰÷√–≈œ¢
		String config = pro.getProperty("program.config");
		if(config == null){
			FONT = "Œ¢»Ì—≈∫⁄";
			COLOR = "red";
			RANGE = 30;
		}else if(config.equals("yellowStyle")){
			FONT = "ø¨ÃÂ";
			COLOR = "yellow";
			RANGE = 10;
		}else{
			FONT = "Œ¢»Ì—≈∫⁄";
			COLOR = "blue";
			RANGE = 10;
		} 
	}
	
	public static Configuration getInstance() throws IOException{
		if(ConfigInstance == null){
			ConfigInstance = new Configuration();
		}
		return ConfigInstance;
	}

	@Override
	public String toString() {
		return "Configuration [FONT=" + FONT + ", COLOR=" + COLOR + ", RANGE="
				+ RANGE + "]";
	}

	
}
