package bridge;

public class BenzCar extends Car {
	public void setRoad(Road road) {
		this.road = road;
	}
	@Override
	public void runCar() {
		System.out.print("Benz ");
		road.run();
	}
}
