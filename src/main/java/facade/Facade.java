package facade;

public class Facade {
	public void action() {
		SubSystem1 sys1 = new SubSystem1();
		SubSystem2 sys2 = new SubSystem2();
		sys1.action();
		sys2.action();
	}
}
