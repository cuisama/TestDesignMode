package _03Mediator;

public class USA extends Country{

	USA(UnitedNations un) {
		super(un);
		this.name = "USA";
	}

	void declare(String msg){
		this.mediator.declare(this.name, msg);
	}
	
//	void getMsg(String countryName, String msg){
//		System.out.println("美国获得" + countryName + "消息" + msg);
//	}
}
