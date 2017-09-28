package bridge;

public class Client {
	public static void main(String[] args) {
		Car car = new BMWCar();
		Road road = new HighWay();
		car.setRoad(road);
		car.runCar();
	}
}
