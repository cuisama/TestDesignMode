package _15Builder;

public class Builder2 extends Builder{

	private Person person = new Person();
	
	@Override
	void takeCoat() {
		person.Dress("毛衣");
	}

	@Override
	void takePants() {
		person.Dress("棉裤");
	}

	@Override
	void takeShoe() {
		person.Dress("雪地靴");
	}

	@Override
	Person get() {
		return person;
	}
}
