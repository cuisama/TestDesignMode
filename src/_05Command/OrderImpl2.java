package _05Command;

public class OrderImpl2 extends Order{

	public OrderImpl2() {
		super();
		this.name="烤羊肉串";
	}

	@Override
	void exec() {
		super.kitchen.exec(this);
	}

}
