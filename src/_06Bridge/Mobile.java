package _06Bridge;

public abstract class Mobile {
	
	protected MobileSoft soft;
	protected Mobile(MobileSoft soft){
		this.soft = soft;
	}
	
	protected void setMobileSoft(MobileSoft soft){
		this.soft = soft;
	}
	
	abstract void run();
}
