package _05Command;

/**
 * 命令模式的命令
 * @author 8LB11L2
 *
 */
public abstract class Order {

	protected String name="";
//	private Kitchen kitchen;
	protected Kitchen kitchen;
	
	public Order(){
		this.kitchen = Kitchen.getInstance();
	}
	
	abstract void exec();
	
//	public void exec(){
//		kitchen.exec(this);
//	}
}
