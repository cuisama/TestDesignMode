package _01Interpreter;

public abstract class Expression {

	
	String Interpret(String text){
		String result = "";
		while(text.length()>0){
			String tc = text.substring(0, 1);
			char c = tc.toCharArray()[0];
			result += execute(c);
			text = text.substring(1);
		}
		return result;
	}
	
	abstract String execute(char str);
}
