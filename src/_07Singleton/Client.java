package _07Singleton;

public class Client {

	public static void main(String args[]){
		Singleton s1 = Singleton.getInstance1();
		Singleton s2 = Singleton.getInstance2();
		Singleton s3 = Singleton.getInstance3();
		if(s1 == s2 && s2 == s3){
			System.out.println("==");
		}
		HungrySingleton s4 = HungrySingleton.getInstance();
		HungrySingleton s5 = HungrySingleton.getInstance();
		if(s4 == s5){
			System.out.println("==");
		}
	}
}
