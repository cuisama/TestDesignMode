package _19Factory;

public class Client {

	public static void main(String args[]){
		IFactory factory = new AddFactory();//如果要换 只要改这里 new SubFactory()
		Operator op = factory.createOperator();
		op.num1 =1;
		op.num2 =2;
		double result = op.getResult();
		System.out.println(result);
		
	}
}
