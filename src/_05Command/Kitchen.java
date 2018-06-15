package _05Command;

public class Kitchen {

	private static Kitchen kitchen;
	
	public static Kitchen getInstance(){
		if(kitchen == null){
			kitchen = new Kitchen();
		}
		return kitchen;
	}
	
	public void exec(Order o){
		System.out.println("Kitchen开始做" + o.name);
	}
}
