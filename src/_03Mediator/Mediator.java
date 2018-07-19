package _03Mediator;

public class Mediator extends UnitedNations{

	Country c1;
	Country c2;
	
	Mediator(Country c1, Country c2){
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	protected void declare(String countryName, String msg) {
		if(c1.name.equals(countryName)){
			c2.getMsg(countryName, msg);
		}
		else
		{
			c1.getMsg(countryName, msg);
		}
	}

}
