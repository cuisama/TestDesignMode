package _14Observer;

public class Worker extends Observer{
	
	String name;
	Listener subject;
	
	public Worker(String name, Listener subject){
		this.name = name;
		this.subject = subject;
		this.subject.Attach(this);//不要这一步，在外边attach
	}
	
	@Override
	public void updateState(){
		switch(subject.getState()){ //应该是观察一种具体对象的行为，所以没有必要是抽象的
			case "come":
				System.out.println(name + "去工作");
				break;
			case "go":
				System.out.println(name + "玩喽");
				break;
		}
	}
}
