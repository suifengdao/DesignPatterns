package decorator;

//装饰者（装饰者的基类中必须存在被装饰类，因此才能表现出被装饰类的行为。）
public class SportsCar extends DecoratorCar {
	private Car car;
	public SportsCar(Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		System.out.println("Load Nitrogen...");
		this.car.run();
		System.out.println("Release Nitrogen...");
	}
}
