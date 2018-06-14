package _21Decorator;

public class DecoratorA extends Decorator{

	private String addedState;//本类独有的功能 区别于DecoratorB
	
	@Override
	void operation() {
		super.operation();
		addedState ="DecoratorA";
		System.out.println(addedState);
	}

}
