package flyweight;

/**
 * @author TGP
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
 */
public class Client {
	public static void main(String[] args) {
		FlyweightDemo f = new FlyweightDemo();
		f.getCar("RED").run();
		f.getCar("GREEN").run();
		f.getCar("GREEN").run();
		f.getCar("BLUE").run();
	}
}
