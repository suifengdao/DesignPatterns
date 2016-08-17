package factoryMethodPattern;

import java.util.HashMap;
import java.util.Map;

public class PeopleFactoryDelayInitial {
	private static Map<String,People> map=new HashMap<String,People>();
	public static synchronized People getPeople(String peopleType) throws Exception{
		People people=map.get(peopleType);
		if(people==null){
			if(peopleType.equals("WhitePeople")){
				people=new WhitePeople();
			}else if(peopleType.equals("YellowPeople")){
				people=new YellowPeople();
			}else{
				throw new Exception("wrong type");
			}
			map.put(peopleType, people);
		}
		return people;
	}
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		People people=PeopleFactoryDelayInitial.getPeople("WhitePeople");
		people.say();
		System.out.println(people);
		people=PeopleFactoryDelayInitial.getPeople("WhitePeople");
		people.say();
		System.out.println(people);
		people=PeopleFactoryDelayInitial.getPeople("YellowPeople");
		people.say();
		System.out.println(people);
		people=PeopleFactoryDelayInitial.getPeople("BlackPeople");
		people.say();
		System.out.println(people);
	}

}
