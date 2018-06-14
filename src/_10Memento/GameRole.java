package _10Memento;

public class GameRole {

	int attach;
	int defensive;
	int blood;
	
	public GameRole(){
		this.attach = 100;
		this.defensive = 100;
		this.blood = 100;
	}
	
	public void fight(){
		this.attach -= (int)(Math.random()*100);
		this.defensive -= (int)(Math.random()*100);
		this.blood -= (int)(Math.random()*100);
	}
	
	public GameRoleMemento saveState(){
		return new GameRoleMemento(this.attach, this.defensive, this.blood);
	}
	
	public void recoverState(GameRoleMemento grm){
		this.attach = grm.attach;
		this.defensive = grm.defensive;
		this.blood = grm.blood;
	}
	
	public void showState(){
		System.out.println(this.attach + " " + this.defensive + " " + this.blood);
	}
}
