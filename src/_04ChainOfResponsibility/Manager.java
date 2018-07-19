package _04ChainOfResponsibility;

public abstract class Manager {

	protected String name;
	
//	protected Manager(String name){
//		this.name = name;
//	}
	
	protected Manager superior;
	
	protected void setSuperior(Manager manager){
		this.superior = manager;
	}
	
	protected abstract void requestApplication(Request request);
}
