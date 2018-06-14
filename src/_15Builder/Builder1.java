package _15Builder;

public class Builder1 extends Builder{

	private Person person = new Person();
	
	@Override
	void takeCoat() {
		person.Dress("T恤衫");
	}

	@Override
	void takePants() {
		person.Dress("牛仔裤");
	}

	@Override
	void takeShoe() {
		person.Dress("运动鞋");
	}

	@Override
	Person get() {
		return person;
	}

}
