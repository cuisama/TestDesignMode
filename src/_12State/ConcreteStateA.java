package _12State;

public class ConcreteStateA extends State{

	@Override
	void handler(Context context) {
		context.state = new ConcreteStateB(); 
	}

}
