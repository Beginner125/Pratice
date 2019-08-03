package person.liming.test.test30;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFast {
	
	public static List<String> getImg(StringBuffer sb){
		List<String> re = new ArrayList<String>();
		Pattern pattern = Pattern.compile("<div([\\w\\W]*)</div>");
		Matcher matcher = pattern.matcher(sb);
		//获取数据，存入re
		while(matcher.find()){
			re.add(matcher.group());
		}
		
		return re;
	}
}
