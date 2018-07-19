package _04ChainOfResponsibility;

public class Majordomo extends Manager{

	Majordomo(String name){
		super(name);
	}
	
	@Override
	protected void requestApplication(Request request) {
		if(request.type=="请假"&&request.number<5){
			System.out.println(name+"批准了"+request.type+"为"+request.number);
		}else{
			this.superior.requestApplication(request);
		}
	}

}
