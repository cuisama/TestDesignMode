package _12State;

public class Context {

	State state;
	
	public Context(State state){
		this.state = state;
	}
	
	public void request(){
		this.state.handler(this);
		System.out.println(state.getClass().getName());
	}
}
