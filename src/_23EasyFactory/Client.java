package _23EasyFactory;

public class Client {

	public static void main(String args[]){
		Operator ope = EasyFactory.createOperate("+");
		ope.num1=1;
		ope.num2=2;
		double result = ope.getResult();
		System.out.println(result);
	}
}
