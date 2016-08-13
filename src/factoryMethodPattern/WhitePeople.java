package factoryMethodPattern;

public class WhitePeople extends People{

	@Override
	public void getColor() {
		System.out.println("White");
		
	}

	@Override
	public void say() {
		System.out.println("English");
		
	}
	
}
