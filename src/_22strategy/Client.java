package _22strategy;

public class Client {

	public static void main(String args[]){
		Factory cash = new Factory(new Dazhe());
		double result = cash.discount(128);
		System.out.println(result);
		
		cash = new Factory(new Manjian());
		result = cash.discount(128);
		System.out.println(result);
	}
}
