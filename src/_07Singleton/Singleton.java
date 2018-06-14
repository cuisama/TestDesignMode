package _07Singleton;

/**
 * 懒汉式的单例模式
 * 要在第一次引用时，才会将自己实例化
 * @author 8LB11L2
 *
 */
public class Singleton {
	//volatile 优化器在用到这个变量时必须每次都小心地重新读取这个变量的值，而不是使用保存在寄存器里的备份
	private static volatile Singleton instance;
	//private static Singleton instance;
	
	/**
	 * 单例模式
	 * @return
	 */
	public static Singleton getInstance1(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	/**
	 * 线程安全的单例
	 * @return
	 */
	public static Singleton getInstance2(){
		synchronized(Singleton.class){//或者使用synchronized直接修饰方法
			if(instance == null){
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	/**
	 * 双重锁定
	 * @return
	 */
	public static Singleton getInstance3(){
		if(instance == null){//如果没有这一行，那么所有的线程都要排队判断instance是否为空，浪费时间
			//两个线程都会执行到这里
			synchronized(Singleton.class){
				//但只有一个线程会执行到这里
				if(instance == null){//第一个线程执行到这为null，第二个就不会为空了
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
