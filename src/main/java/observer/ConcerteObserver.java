package observer;

public class ConcerteObserver implements Observer{
	@Override
	public void update() {
		System.out.println("Now I see you changed!");
	}
}
