package flyweight;

public class BMWCar extends Car {
	public BMWCar() {
		System.out.println("create car");
	}
	@Override
	public void run() {
		System.out.println(getColor()+" car run!");
	}
}
