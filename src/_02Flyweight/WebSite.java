package _02Flyweight;

public abstract class WebSite {

	protected String name;
	
	protected WebSite(String name){
		this.name = name;
	}
	
	public abstract void use();
}
