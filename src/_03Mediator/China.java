package _03Mediator;

public class China extends Country{

	China(UnitedNations un) {
		super(un);
		this.name = "China";
	}

	void declare(String msg){
		this.mediator.declare(this.name, msg);
	}
	
//	void getMsg(String countryName, String msg){
//		System.out.println("中国获得" + countryName + "消息" + msg);
//	}
}
