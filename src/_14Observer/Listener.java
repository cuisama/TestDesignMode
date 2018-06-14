package _14Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Listener {

	private List<Worker> list = new ArrayList<Worker>();
	
	public void Attach(Worker w){
		list.add(w);
	}
	
	public void Detach(Worker w){
		list.remove(w);
	}
	
	public void toNotify(){
		System.out.println("状态是："+getState());
		for(Worker w : list){
			w.updateState();
		}
	}
	
	abstract String getState();
	abstract void setState(String state);
}
