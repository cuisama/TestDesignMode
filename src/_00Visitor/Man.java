package _00Visitor;

public class Man extends Person{

	@Override
	void Accept(Action action) {//双分派技术，将action给person，完成第一次分派
		action.GetMan(this);//将自己给action，完成第二次分派
	}

}
