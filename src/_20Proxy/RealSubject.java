package _20Proxy;

public class RealSubject extends Subject{

	@Override
	void request() {
		System.out.println("from RealSubject");
	}

}
