package _05Command;

public class Client {

	public static void main(String args[]){
		Order o1 = new OrderImpl1();
		Order o2 = new OrderImpl2();
		Order o3 = new OrderImpl1();
		Waiter w = new Waiter();
		w.setOrder(o1);
		w.setOrder(o2);
		w.toNotify();
		w.setOrder(o3);
		w.toNotify();	
		
	}
}
