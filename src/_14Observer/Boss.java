package _14Observer;

public class Boss extends Listener{

	String state = "";

	@Override
	public String getState() {
		return state;
	}
	
	@Override
	public void setState(String state) {
		this.state = state;
	}
	
}
