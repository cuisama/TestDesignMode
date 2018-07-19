package _04ChainOfResponsibility;

public class Client {

	public static void main(String[] args){
		Manager m1 = new GeneralManager("老大");
		Manager m2 = new Majordomo("老二");
		m2.setSuperior(m1);
		Manager m3 = new CommonManager("老三");
		m3.setSuperior(m2);
		
		Request req = new Request();
		req.type = "请假";
		req.number = 1;
		
		m3.requestApplication(req);
		
		req.number = 3;
		m3.requestApplication(req);
		
		req.number = 6;
		m3.requestApplication(req);
		
		req.type = "加薪";
		m3.requestApplication(req);
		
		req.type = "开会";
		m3.requestApplication(req);
	}
	
}
