package _03Mediator;

public class Japan extends Country{

	Japan(UnitedNations un) {
		super(un);
		this.name = "Japan";
	}

	void declare(String msg){
		this.mediator.declare(this.name, msg);
	}
	
//	void getMsg(String countryName, String msg){
//		System.out.println("日本获得" + countryName + "消息" + msg);
//	}
}
