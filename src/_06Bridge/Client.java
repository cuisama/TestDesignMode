package _06Bridge;

/**
 * 	桥接模式
 * @author 8LB11L2
 *
 */
public class Client {

	public static void main(String args[]){
		MobileSoft s1 = new MobileGame();
		MobileSoft s2 = new MobileBrowser();
		Mobile m1 = new MobileMI(s1);
		m1.run();
		m1.setMobileSoft(s2);
		m1.run();
		
		Mobile m2 = new MobileViVo(s1);
		m2.run();
		m2.setMobileSoft(s2);
		m2.run();
		
	}
}
