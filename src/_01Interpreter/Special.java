package _01Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Special extends Expression{

	private static Map<String, String> map;
	
	Special(){
		if(map == null){
			map = new HashMap<String, String>();
			map.put(".", ".-.-.-");
			map.put(",", "--..--");
			map.put(":", "---...");
			map.put("?", "..--..");
			map.put("\'" ,".----.");
			map.put("-", "-....-");
			map.put("/", "-..-.");
			map.put("(", "-.--.");
			map.put(")", "-.--.-");
			map.put("\"" ,".-..-.");
			map.put("=", "-...-");
			map.put("+", ".-.-.");
			map.put("*", "-..-");
			map.put("@", ".--.-.");
		}
	}
	
	@Override
	String execute(char str) {
		if(map.containsKey(str)){
			return map.get(str);
		}
		return "";
	}

}
