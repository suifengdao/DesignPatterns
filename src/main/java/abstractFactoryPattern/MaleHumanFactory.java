package abstractFactoryPattern;

public class MaleHumanFactory extends HumanFactory{

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

}
