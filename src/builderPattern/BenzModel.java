package builderPattern;

public class BenzModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("Benz start");
		
	}

	@Override
	protected void stop() {
		System.out.println("Benz stop");
		
	}

	@Override
	protected void alarm() {
		System.out.println("Benz alarm");
		
	}

}
