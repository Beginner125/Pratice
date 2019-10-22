package person.liming.test.test27;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * @author liuliming
 * @Description JAVA SAX½âÎöÆ÷-½âÎöXMLÎÄµµ
 */
public class Test27 {

	public static void main(String[] args) {
		File inputFile = new File("src/file/student.xml");
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser;
		
		try {
			saxParser = factory.newSAXParser();
			UserHandler userHandler = new UserHandler();
			saxParser.parse(inputFile, userHandler);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

