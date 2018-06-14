package _09Composite;

import java.util.ArrayList;
import java.util.List;

public class Group extends Organization{
	
	private List<Organization> list = new ArrayList<Organization>();

	protected Group(String name) {
		super(name);
	}
	
	@Override
	void add(Organization org) {
		list.add(org);
	}

	@Override
	void remove(Organization org) {
		list.remove(org);		
	}

	@Override
	void display() {
		System.out.println(this.name);
		for(Organization o : list){
			o.display();
		}
	}

}
