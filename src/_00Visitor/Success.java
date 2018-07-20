package _00Visitor;

public class Success extends Action{

	@Override
	void GetMan(Man man) {
		System.out.println("男人成功很高兴");
	}

	@Override
	void GetWoman(Woman woman) {
		System.out.println("女人成功很沮丧");
	}

}
