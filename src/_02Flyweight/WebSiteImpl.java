package _02Flyweight;

public class WebSiteImpl extends WebSite{

	WebSiteImpl(String name) {
		super(name);
	}

	@Override
	public void use() {
		System.out.println(this.name);
	}

}
