package _18Prototype;

public class Client {

	public static void main(String[] args){
		WorkExperience work = new WorkExperience("阿里", "2008");
		Introduce intro1 = new Introduce("张三", 32, work);
		
		
		
		Introduce intro2 = (Introduce)intro1.clone();
//		intro2.workExperience = new WorkExperience("腾讯", "2012"); //即时底层实现是浅复制，intro2也不会再影响intro1
		intro2.workExperience.companayName = "腾讯";
		intro2.workExperience.WorkStartTime = "2012";
		
		
		
		Introduce intro3 = intro1;
		intro3.name = "李四";
		intro3.workExperience.companayName = "Google";
		intro3.workExperience.WorkStartTime = "2016";
		
		System.out.println(intro1.toString());
		System.out.println(intro2.toString());
		System.out.println(intro3.toString());		
	}
}
