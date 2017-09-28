package adapter;

public class Client {
	public static void main(String[] args) {
		Target target1 = new ConcreteTarget();
		target1.request();
		Target target2 = new ClassAdapter();
		target2.request();
		Target target3 = new ObjectAdapter(new Adaptee());
		target3.request();
	}
}
