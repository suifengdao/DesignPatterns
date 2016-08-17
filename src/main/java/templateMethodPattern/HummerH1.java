package templateMethodPattern;

public class HummerH1 extends HummerModel{
	private boolean alarmState = true;
	@Override
	protected void start() {
		System.out.println("H1 start...");
		
	}

	@Override
	protected void stop() {
		System.out.println("H1 stop...");
		
	}

	@Override
	protected void alarm() {
		System.out.println("H1 alarm...");
		
	}
	
	@Override
	protected boolean isAlarm() {
		return alarmState;
	}
	
	public void setAlarm(boolean alarmState){
		this.alarmState=alarmState;
	}
}
