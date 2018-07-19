package _03Mediator;

import java.util.HashMap;
import java.util.Map;

public class SecurityCouncil extends UnitedNations{
	public Map<String, Country> map = new HashMap<String, Country>();
	@Override
	protected void declare(String countryName, String msg) {
		
		for(String key : map.keySet()){
			if(!countryName.equals(key)){
				map.get(key).getMsg(countryName, msg);
			}
		}
		
	}

}
