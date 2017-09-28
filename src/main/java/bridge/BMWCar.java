package bridge;

public class BMWCar extends Car{
	public void setRoad(Road road) {
		this.road = road;
	}
	@Override
	public void runCar() {
		System.out.print("BMW ");
		road.run();
	}
}
