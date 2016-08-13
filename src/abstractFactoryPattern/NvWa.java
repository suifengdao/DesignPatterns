package abstractFactoryPattern;

public class NvWa {
	public static void main(String[] args) {
		HumanFactory maleHumanFactory=new MaleHumanFactory();
		Human maleWhiteHuman=maleHumanFactory.createWhiteHuman();
		HumanFactory femaleHumanFactory=new FemaleHumanFactory();
		Human femaleYellowHuman=femaleHumanFactory.createYellowHuman();
		maleWhiteHuman.getColor();
		maleWhiteHuman.say();
		maleWhiteHuman.getSex();
		femaleYellowHuman.getColor();
		femaleYellowHuman.say();
		femaleYellowHuman.getSex();
	}
}
