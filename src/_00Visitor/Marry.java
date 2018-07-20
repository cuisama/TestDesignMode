package _00Visitor;

public class Marry extends Action{

	@Override
	void GetMan(Man man) {
		System.out.println("男人结婚很沮丧");
	}

	@Override
	void GetWoman(Woman woman) {
		System.out.println("女人结婚很高兴");
	}

}
