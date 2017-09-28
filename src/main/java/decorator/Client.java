package decorator;

public class Client {
	public static void main(String[] args) {
		Car car = new BMWCar();
		SportsCar sportsCar = new SportsCar(car);
		car.run();
		System.out.println("===========================");
		sportsCar.run();
	}
}
