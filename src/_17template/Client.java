package _17template;

public class Client {

	public static void main(String[] args){
		TemplateServlet login = new LoginServlet();
		login.doExecute();
		
		TemplateServlet select = new SelectServlet();
		select.doExecute();
	}
}
