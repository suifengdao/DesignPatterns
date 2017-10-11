package proxy;

//静态代理类
public class StaticProxySubject implements Subject{
	private Subject subject;
	public StaticProxySubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void visit() {
		System.out.println("before proxy!");
		this.subject.visit();
		System.out.println("after proxy!");
	}
}
