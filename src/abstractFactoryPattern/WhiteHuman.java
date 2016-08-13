package abstractFactoryPattern;

public abstract class WhiteHuman extends Human{

	@Override
	public void getColor() {
		System.out.println("White");
		
	}

	@Override
	public void say() {
		System.out.println("English");
		
	}

}
