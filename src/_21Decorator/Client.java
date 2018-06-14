package _21Decorator;

public class Client {

	public static void main(String args[]){
		
		
		Decorator decorator = new Decorator();
		DecoratorA decoratorA = new DecoratorA();
		Decorator decoratorB = new DecoratorB();
		
		decorator.SetComponent(decoratorA);
		decoratorA.SetComponent(decoratorB);
		decorator.operation();
	}
}
