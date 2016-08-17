package factoryMethodPattern;

public class YellowPeople extends People{

	@Override
	public void getColor() {
		System.out.println("Yellow");
		
	}

	@Override
	public void say() {
		System.out.println("Chinese");
		
	}

}
