package _05Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

	private List<Order> orderList = new ArrayList<>();
	
	public void setOrder(Order order){
		orderList.add(order);
	}
	
	public void cancelOrder(Order order){
		orderList.remove(order);
	}
	
	public void toNotify(){
		System.out.println("序列开始：");
		for(Order o : orderList){
			o.exec();
		}
		orderList = new ArrayList<>(); 
	}
	
}
