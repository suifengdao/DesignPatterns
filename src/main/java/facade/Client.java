package facade;

/**
 * 外观模式的目的不是给予子系统添加新的功能接口，而是为了让外部减少与子系统内多个模块的交互，
 * 松散耦合，从而让外部能够更简单地使用子系统。
 * 外观模式的本质是：封装交互，简化调用。
 * @author TGP
 */
public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.action();
	}
}
