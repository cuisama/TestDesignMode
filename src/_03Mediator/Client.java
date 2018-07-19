package _03Mediator;

public class Client {

	public static void main(String[] args){
		//广播代理
		SecurityCouncil un = new SecurityCouncil();
		
		Country c1 = new USA(un);
		Country c2 = new China(un);
		Country c3 = new Japan(un);
		
		un.map.put(c1.name, c1);
		un.map.put(c2.name, c2);
		un.map.put(c3.name, c3);
		
		c1.declare(" 你谁");
		c2.declare(" 滚");
		
		//两个人之间的代理
		Mediator m1 = new Mediator(c1, c2);
		
		c1.mediator = m1;
		c2.mediator = m1;
		
		c1.declare(" 说话");
		c2.declare(" 闭嘴");
	
	}
}
