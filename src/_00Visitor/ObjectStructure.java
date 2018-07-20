package _00Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类 针对一个行为，察看所有对象的反应
 * @author 8LB11L2
 *
 */
public class ObjectStructure {

	List<Person> list = new ArrayList<Person>();
	
	void display(Action action){
		for(Person p : list){
			p.Accept(action);
		}
	}
}
