package _17template;

public class SelectServlet extends TemplateServlet{

	@Override
	void registTask() {
		System.out.println("SelectServlet.registTask");
	}

	@Override
	void createTask() {
		System.out.println("SelectServlet.createTask");
	}


}
