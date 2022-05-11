import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		//set the path for the properties file
		
		FileInputStream input=new FileInputStream("./src/main/java/utils/MultiLang.properties");
		
		//Create obj for the property file
		Properties property=new Properties();
		
		//load the property file
		property.load(input);
		
		System.out.println(property.getProperty("Language"));
		
		
		
		
	}

}
