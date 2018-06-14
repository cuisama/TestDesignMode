package _09Composite;

/**
 * 组合模式
 * @author 8LB11L2
 *
 */
public class Clinet {

	public static void main(String args[]){
		Group g=new Group("集团");
		Company c1 = new Company("北京分公司");
		Company c2 = new Company("上海分公司");
		Department d1 = new Department("政治部");
		Department d2 = new Department("保安局");
		Department d3 = new Department("政治部");
		Department d4 = new Department("保安局");
		g.add(c1);
		g.add(c2);
		c1.add(d1);
		c1.add(d2);
		c2.add(d3);
		c2.add(d4);
		g.display();
	}
}
