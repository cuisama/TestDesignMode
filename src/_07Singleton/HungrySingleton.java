package _07Singleton;

/**
 * 饿汉式的单例模式
 * 在自己被加载时，就实例化
 * @author 8LB11L2
 *
 */
public class HungrySingleton {

	private static final HungrySingleton instance = new HungrySingleton();
	
	public static HungrySingleton getInstance(){
		return instance;
	}
}
