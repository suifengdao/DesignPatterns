package abstractFactoryPattern;

public abstract class YellowHuman extends Human{
	@Override
	public void getColor() {
		System.out.println("Yellow");
		
	}

	@Override
	public void say() {
		System.out.println("Chinese");
		
	}
}
