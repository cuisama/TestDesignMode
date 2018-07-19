package _04ChainOfResponsibility;

public class GeneralManager extends Manager{

	GeneralManager(String name){
		super(name);
	}
	
	@Override
	protected void requestApplication(Request request) {
		if(request.type.equals("请假")){
			System.out.println(name+"批准了"+request.type+"为"+request.number);
		}else if(request.type.equals("加薪")){
			System.out.println(name+"批准了"+request.type+"为"+request.number);
		}else{
			System.out.println(name+"驳回了"+request.type+"为"+request.number);
		}
	}

}
