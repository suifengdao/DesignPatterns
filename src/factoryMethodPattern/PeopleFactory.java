package factoryMethodPattern;

public class PeopleFactory extends AbstractPeopleFactory{

	@Override
	public <T extends People> T createPeople(Class<T> c) {
		People people;
		try{
			//constructor must public
			people = (People)Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			System.out.println("Create People failed!");
			people = null;
		}
		return (T)people;
	}

}
