package prototype;

public abstract class Prototype implements Cloneable{
	protected String name;
	public Object clone(){
		Object clone = null;
			try {
				clone = super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return clone;
	}
}