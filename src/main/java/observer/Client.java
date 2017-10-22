package observer;

public class Client {
	public static void main(String[] args) {
		Subject s = new ConcerteSubject();
		Observer o = new ConcerteObserver();
		s.addObserver(o);
		s.notifyObservers();
	}
}
