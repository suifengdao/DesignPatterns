package abstractFactoryPattern;

public class FemaleHumanFactory extends HumanFactory{

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

}
