package singletonPattern;

public class Minister {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			Emperor.getInstance().say();
		}
	}

}
