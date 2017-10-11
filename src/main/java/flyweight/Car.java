package flyweight;

public abstract class Car {
	private String color;
	public abstract void run();
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
