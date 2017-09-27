package prototype;

public class ConcretePrototype extends Prototype {
	public ConcretePrototype(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		Prototype cp = new ConcretePrototype("ConcretePrototype");
		Prototype cp2 = (Prototype)cp.clone();
		System.out.println(cp.toString());
		System.out.println(cp2.toString());
	}
}
