package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightDemo {
	Map<String, Car> cars = new HashMap<String, Car>();//类似于登记模式的原型模式，或者多例模式
	public Car getCar(String color) {
		Car car = cars.get(color);
		if (null == car) {
			synchronized (this) {
				car = cars.get(color);
				if (null == car) {
					car = new BMWCar();
					car.setColor(color);
					cars.put(color, car);
				}
			}
		}
		return car;
	}
}
