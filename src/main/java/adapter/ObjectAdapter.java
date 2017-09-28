package adapter;

//对象适配器，类似于代理(推荐)
public class ObjectAdapter implements Target{
	private Adaptee adaptee;
	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void request() {
		this.adaptee.specificRequest();
	}
}
