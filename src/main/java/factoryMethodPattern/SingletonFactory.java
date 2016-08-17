package factoryMethodPattern;

import java.lang.reflect.Constructor;

public class SingletonFactory {
	private static Singleton signgleton;
	static{
		try{
			Class cl=Class.forName(Singleton.class.getName());
//			signgleton=(Singleton)cl.newInstance();
			Constructor c=cl.getDeclaredConstructor();
			c.setAccessible(true);
			signgleton=(Singleton)c.newInstance();
		}catch(Exception e){e.printStackTrace();}
	}
	public Singleton getSingleton(){
		return signgleton;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonFactory sf=new SingletonFactory();
		Singleton s=sf.getSingleton();
		s.doSomething();
	}

}
