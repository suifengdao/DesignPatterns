package proxy;

public class RealSubject implements Subject {
	@Override
	public void visit() {
		System.out.println("Real visit ...");
	}
}
