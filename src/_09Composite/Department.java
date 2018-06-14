package _09Composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends Organization{

	private List<Organization> list = new ArrayList<>();
	
	protected Department(String name) {
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
