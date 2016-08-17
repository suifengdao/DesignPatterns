package factoryMethodPattern;

public abstract class AbstractPeopleFactory {
	public abstract <T extends People> T createPeople(Class<T> c);
}
