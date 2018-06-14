package _12State;

public class ConcreteStateB extends State{

	@Override
	void handler(Context context) {
		context.state = new ConcreteStateA(); 
	}

}
