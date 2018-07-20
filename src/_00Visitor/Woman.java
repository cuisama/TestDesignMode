package _00Visitor;

public class Woman extends Person{

	@Override
	void Accept(Action action) {
		action.GetWoman(this);
	}

}
