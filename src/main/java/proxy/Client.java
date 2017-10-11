package proxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		//静态代理
		Subject subject = new RealSubject();
		StaticProxySubject sps = new StaticProxySubject(subject);
		sps.visit();
		
		//动态代理
		//Subject subject = new RealSubject();
		DynamicProxy proxy = new DynamicProxy(subject);
		ClassLoader classLoader = subject.getClass().getClassLoader();
		//生成动态代理对象
		Subject dynamicProxySubject = (Subject) Proxy.newProxyInstance(classLoader, new  Class[]{Subject.class}, proxy);
		dynamicProxySubject.visit();
	}
}
