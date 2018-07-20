package _01Interpreter;

public class Client {

	public static void main(String[] args){
		
		PlayContext p = new PlayContext();
		p.playText="543张dfhgd三45y  ()*&";
		String result = p.encrypt();
		System.out.println(result);
	}
}
