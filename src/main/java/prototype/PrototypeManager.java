package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
	private Map<Integer, Prototype> prototypes = new HashMap<Integer, Prototype>();
	public Prototype getPrototype(int id) {
		Prototype prototype = prototypes.get(id);
		if (null == prototype) {
			prototype = new ConcretePrototype("ConcretePrototype:" + id);
			prototypes.put(id, prototype);
		}
		return (Prototype)prototype.clone();
	}

	public static void main(String[] args) {
		PrototypeManager pm = new PrototypeManager();
		System.out.println(pm.getPrototype(1).toString());
		System.out.println(pm.getPrototype(2).toString());
	}
}
