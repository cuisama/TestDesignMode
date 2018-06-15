package _12State;

/**
 * 状态模式
 * @author 8LB11L2
 *
 */
public class Client {

	public static void main(String args[]){
		Context c = new Context(new ConcreteStateA());
		c.request();
		c.request();
		c.request();
		c.request();
		c.request();
	}
}
