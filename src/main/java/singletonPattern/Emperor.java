package singletonPattern;

//恶汉式，非懒加载，线程安全
public class Emperor {
	private static final Emperor emperor= new Emperor();
	private Emperor(){};
	public static Emperor getInstance(){
		return emperor;
	}
	public void say(){
		System.out.println("Hi, I'm Emperor A!");
	}
}
