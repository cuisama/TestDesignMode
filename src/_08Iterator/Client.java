package _08Iterator;

public class Client {

	public static void main(String args[]){
		ConcreteAggregate ca = new ConcreteAggregate();
		ca.add(5);
		ca.add("哈哈");
		ca.add(new Object());
		ca.add(new int[]{1,2,3});
		Iterator it = ca.createIterator();
		while(it.hasNext()){
			System.out.print(it.current() + "	");
			System.out.println(it.next());
		}
	}
}
