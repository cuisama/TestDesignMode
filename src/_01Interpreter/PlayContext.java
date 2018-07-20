package _01Interpreter;

public class PlayContext {

	String playText = "";
	
	static Expression number = new Number();
	static Expression letter = new Letter();
	static Expression chinese = new Chinese();
	static Expression special = new Special();
	
	String encrypt(){
		String result = "";
		String temp = playText;

		while(temp.length()>0){
			String tc = temp.substring(0, 1);
			char c = tc.toCharArray()[0];
			int x = Integer.valueOf(c);
			if(48 <= x && x <= 57){
				result += number.execute(c);
			}else if(65 <= x && x <= 90 || 97 <= x && x <= 122){
				result += letter.execute(tc.toUpperCase().toCharArray()[0]);
			}else if(x < 255){
				result += special.execute(c);
			}
			else{
				result += chinese.execute(c);
			}
			
			temp = temp.substring(1);
		}
		
		return result;
	}
}
