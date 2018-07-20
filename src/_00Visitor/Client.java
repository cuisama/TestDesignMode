package _00Visitor;

public class Client {

	public static void main(String[] args){
		Person m1 = new Man();
		Person m2 = new Woman();
		Action a1 = new Success();
		Action a2 = new Marry();
		
		m1.Accept(a1);
		m1.Accept(a2);
		m2.Accept(a1);
		m2.Accept(a2);
		
		ObjectStructure os = new ObjectStructure();
		os.list.add(m1);
		os.list.add(m2);
		os.display(a1);
		os.display(a2);
		
	}
}
