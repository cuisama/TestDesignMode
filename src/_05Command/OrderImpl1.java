package _05Command;

/**
 * 每个order的继承类都只做一件事，该类只做 洋葱炒肉
 * @author 8LB11L2
 *
 */
public class OrderImpl1 extends Order{

	public OrderImpl1() {
		super();
		this.name="洋葱炒肉";
	}

	@Override
	void exec() {
		super.kitchen.exec(this);
	}

}
