package _16facade;

/**
 * 外观模式
 * @author 8LB11L2
 *
 */
public class Client {

	public static void main(String[] args){
		Proxy p = new Proxy();
		p.doMethodA();
		p.doMethodB();
		p.doMethodC();
	}
}
