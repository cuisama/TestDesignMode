package _15Builder;

public class Client {

	public static void main(String[] args){
		
		Director d = new Director();
		Builder b1 = new Builder1();
		Builder b2 = new Builder2();

		d.Construct(b1);
		d.Construct(b2);

		Person p1 = b1.get();
		Person p2 = b2.get();

		p1.show();
		p2.show();
	}
}
