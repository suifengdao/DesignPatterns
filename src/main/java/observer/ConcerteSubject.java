package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcerteSubject implements Subject{
	List<Observer> observers = new ArrayList<Observer>();
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		System.out.println("I am changing ...");
		for(Observer o : observers) {
			o.update();
		}
	}
}
