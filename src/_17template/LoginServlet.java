package _17template;

public class LoginServlet extends TemplateServlet{

	@Override
	void registTask() {
		System.out.println("LoginServlet.registTask");
	}

	@Override
	void createTask() {
		System.out.println("LoginServlet.createTask");
	}


}
