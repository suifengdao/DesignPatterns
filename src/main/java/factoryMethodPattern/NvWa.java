package factoryMethodPattern;

public class NvWa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PeopleFactory peopleFactory = new PeopleFactory();
		People whitePeople = peopleFactory.createPeople(WhitePeople.class);
		whitePeople.getColor();
		whitePeople.say();
		
		People yellowPeople = peopleFactory.createPeople(YellowPeople.class);
		yellowPeople.getColor();
		yellowPeople.say();
	}

}
