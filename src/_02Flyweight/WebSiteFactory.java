package _02Flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

	private Map<String, WebSite> flyweight = new HashMap<String, WebSite>();
	
	public WebSite GetWebSiteCategory(String key){
		if(!flyweight.containsKey(key)){
			flyweight.put(key, new WebSiteImpl(key));
		}
		return flyweight.get(key);
	}
	
	public int GetWebSiteCount(){
		return flyweight.size();
	}
}
