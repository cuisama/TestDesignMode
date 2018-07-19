package _02Flyweight;
/**
 * 享元模式
 * @author 8LB11L2
 *
 */
public class Client {

	public static void main(String[] args){
		WebSiteFactory f = new WebSiteFactory();
		WebSite ws1 = f.GetWebSiteCategory("产品展示");
		ws1.use(new ExternalState());
		//共享上边生成的对象，不再实例化
		WebSite ws2 = f.GetWebSiteCategory("产品展示");
		ws2.use();
		WebSite ws3 = f.GetWebSiteCategory("播客");
		ws3.use(new ExternalState());
		
		System.out.println(f.GetWebSiteCount());
	}
}
