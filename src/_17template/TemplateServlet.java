package _17template;

public abstract class TemplateServlet {

	abstract void registTask();
	abstract void createTask();
	
	protected void doExecute(){
		this.initEnvironment();
		this.registTask();
		this.createTask();
		this.endTask();
	};
	
	private void endTask(){
		System.out.println("TemplateServlet.endTask-------------");
	}
	
	private void initEnvironment(){
		System.out.println("TemplateServlet.initEnvironment");
	}
}
