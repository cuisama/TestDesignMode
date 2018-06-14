
package _11Adapter;

public class Client {

	public static void main(String args[]){
		Player p1 = new Forward();
		Player p2 = new Center();
		Player p3 = new Translation(new ForeignCenter());

		p1.attch();
		p3.attch();
		p2.attch();
		p3.defensive();
	}
}
