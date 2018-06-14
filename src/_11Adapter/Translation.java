package _11Adapter;

public class Translation extends Player{

	private ForeignCenter fc;
	
	public Translation(ForeignCenter fc){
		this.fc = fc;
	}
	
	@Override
	void attch() {
		fc.jingong();
	}

	@Override
	void defensive() {
		fc.fangshou();
	}

}
