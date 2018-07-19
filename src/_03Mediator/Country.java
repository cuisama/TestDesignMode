package _03Mediator;

public abstract class Country {
	
	protected String name;
	protected UnitedNations mediator;
	
	protected Country(UnitedNations un){
		this.mediator = un;
	}
	
	abstract void declare(String msg);
	protected void getMsg(String countryName, String msg){
		System.out.println(this.name + "获得" + countryName + "消息" + msg);
	}
}
