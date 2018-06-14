package _10Memento;

/**
 * 备忘录模式
 * @author 8LB11L2
 *
 */
public class Client {

	public static void main(String args[]){
		GameRole gr = new GameRole();
		gr.showState();
		GameRoleMemento grm = gr.saveState();
		gr.fight();
		gr.showState();
		gr.recoverState(grm);
		gr.showState();
	}
}
