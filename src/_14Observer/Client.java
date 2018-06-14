package _14Observer;

/**
 * 跟书上的例子不太一样
 * @author 8LB11L2
 *
 */
@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args){
		Listener listener = new Boss();
		Worker w1 = new Worker("张三", listener);
		Worker w2 = new Worker("里斯", listener);
		Worker w3 = new Worker("王五", listener);
		
		listener.Detach(w2);
		
		listener.setState("come");
		listener.toNotify();
		listener.setState("go");
		listener.toNotify();
		
	}
}
