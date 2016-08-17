package templateMethodPattern;

public class HummerH2 extends HummerModel{
	@Override
	protected void start() {
		System.out.println("H2 start...");
		
	}

	@Override
	protected void stop() {
		System.out.println("H2 stop...");
		
	}

	@Override
	protected void alarm() {
		System.out.println("H2 alarm...");
		
	}
	
	@Override
	protected boolean isAlarm() {
		return false;
	}
}
