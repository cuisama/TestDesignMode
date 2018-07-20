package _01Interpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Chinese extends Expression{

	private static Map<String, String> map;
	
	Chinese(){
		if(map == null){
			 map = new HashMap<String, String>();
			 File file = new File(System.getProperty("user.dir") + "\\src\\_01Interpreter\\chinese.txt");
			 //File file = new File("chinese.txt");
			 BufferedReader reader = null;
			 String tempString = null;  
			 try {
				 reader = new BufferedReader(new FileReader(file));
				 while ((tempString = reader.readLine()) != null) {  
					 String[] s = tempString.split(",");
					 map.put(s[0].trim(), s[1].trim());
				 }
				 reader.close();  
			} catch (Exception e) {
				e.printStackTrace();
			}  
		}
	}
	
	@Override
	String execute(char str) {
		String value = map.get("" + str);
		Expression number = new Number();
		return number.Interpret(value);
	}

}
