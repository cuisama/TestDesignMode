package _01Interpreter;

public class Number extends Expression{
	
	private String[] Data = new String[]{
			 "-----"
			,".----"
			,"..---"
			,"...--"
			,"....-"
			,"....."
			,"-...."
			,"--..."
			,"---.."
			,"----."};

	@Override
	String execute(char c) {
		return Data[c - 48];
	}
	
}
