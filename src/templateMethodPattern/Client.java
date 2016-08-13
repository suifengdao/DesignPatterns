package templateMethodPattern;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HummerH1 hummerH1=new HummerH1();
		HummerH2 hummerH2=new HummerH2();
		hummerH1.setAlarm(true);
		hummerH1.run();
		hummerH1.setAlarm(false);
		hummerH1.run();
		hummerH2.run();
	}

}
