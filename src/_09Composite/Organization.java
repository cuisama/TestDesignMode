package _09Composite;

public abstract class Organization {

	String name;
	protected Organization(String name){
		this.name = name;
	}
	
	abstract void add(Organization org);
	abstract void remove(Organization org);
	abstract void display();
}
