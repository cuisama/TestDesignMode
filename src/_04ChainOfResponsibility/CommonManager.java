package _04ChainOfResponsibility;

public class CommonManager extends Manager{

	CommonManager(String name){
		this.name = name;
	}
	
	@Override
	protected void requestApplication(Request request) {
		if(request.type.equals("请假") && request.number<2){
			System.out.println(name+"批准了"+request.type+"为"+request.number);
		}else{
			this.superior.requestApplication(request);
		}
	}

}
