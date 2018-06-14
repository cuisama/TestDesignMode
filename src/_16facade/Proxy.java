package _16facade;

public class Proxy {
	private Proxyed1 p1;
	private Proxyed2 p2;
	private Proxyed3 p3;
	
	public Proxy(){
		this.p1= new Proxyed1();
		this.p2= new Proxyed2();
		this.p3= new Proxyed3();
	}
	
	public void doMethodA(){
		p1.doMethodA();
	}
	
	public void doMethodB(){
		p2.doMethodB();
	}
	
	public void doMethodC(){
		p3.doMethodC();
	}
}
