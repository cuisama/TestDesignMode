package _21Decorator;

public class DecoratorB extends Decorator{
	
	private String addedState(){ 
		return "DecoratorB";
	}
	
	@Override
	void operation() {
		super.operation();
		String s = addedState(); //本类独有的方法，以区别于DecoratorA
		System.out.println(s);
	}

}
