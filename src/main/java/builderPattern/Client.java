package builderPattern;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Director director=new Director();
		director.getBenzModelA().run();
		director.getBenzModelB().run();
		director.getBMWModelA().run();
		director.getBMWModelB().run();
	}

}
