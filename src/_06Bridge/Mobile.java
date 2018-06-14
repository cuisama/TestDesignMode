package _06Bridge;

/**
 * 即使这个抽象类没有抽象方法，但抽象可以使它不能被new
 * @author 8LB11L2
 *
 */
public abstract class Mobile {
	
	protected MobileSoft soft;
	
	protected Mobile(MobileSoft soft){
		this.soft = soft;
	}
	
	protected void setMobileSoft(MobileSoft soft){
		this.soft = soft;
	}
	
	protected void run(){
		soft.run();
	}
}
