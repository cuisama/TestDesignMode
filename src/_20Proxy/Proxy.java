package _20Proxy;

public class Proxy extends Subject{

	private Subject subject;
	@Override
	void request() {
		if(subject == null){
			subject = new RealSubject();
		}
		subject.request();
	}

}
