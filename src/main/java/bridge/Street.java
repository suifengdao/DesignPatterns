package bridge;

public class Street extends Road {
	@Override
	public void run() {
		System.out.println("run slow!");
	}
}
