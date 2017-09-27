package singletonPattern;

//懒汉式，懒加载，线程安全/不安全
public class Singleton {
	private static Singleton singleton;
	private Singleton(){};
	//懒加载，线程不安全(不推荐使用)
	/*
	public static Singleton getInstance(){
		singleton = new Singleton();
		return singleton;
	}
	*/
	
	//懒加载，线程安全
	/*
	public static synchronized Singleton getInstance(){
		singleton = new Singleton();
		return singleton;
	}
	*/
	
	//双检锁/双重校验锁（DCL，即 double-checked locking）  懒加载，线程安全(推荐使用)
	public static Singleton getInstance(){
		if (null == singleton) {
			synchronized (Singleton.class) {
				if (null == singleton) { 
					singleton = new Singleton(); 
				} 
			}
		}
		return singleton;
	}
	
	//登记式/静态内部类, 懒加载(只有使用getInstance时才会加载SingletonHolder类)，线程安全
	/*
	private static class SingletonHolder {  
		private static final Singleton INSTANCE = new Singleton();  
	}
	public static final Singleton getInstance() {  
		return SingletonHolder.INSTANCE;  
	} 
	*/
	
	public void say(){
		System.out.println("Hi, I'm Emperor A!");
	}
}