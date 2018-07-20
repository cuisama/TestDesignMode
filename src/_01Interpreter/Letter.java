package _01Interpreter;

public class Letter extends Expression{


	
	@Override
	String execute(char c) {
		int x = Integer.valueOf(c);
		
		return Data[x - 65];
	}
	
	private String[] Data = new String[]{
			 ".-"
			,"-..."
			,"-.-."
			,"-.."
			,"."
			,"..-."
			,"--."
			,"...."
			,".."
			,".---"
			,"-.-"
			,".-.."
			,"--"
			,"-."
			,"---"
			,".--."
			,"--.-"
			,".-."
			,"..."
			,"-"
			,"..-"
			,"...-"
			,".--"
			,"-..-"
			,"-.--"
			,"--.."};
}
