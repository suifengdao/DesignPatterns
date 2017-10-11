package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理类
public class DynamicProxy implements InvocationHandler {
    private Object object;
    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    	System.out.println("before proxy!");
        Object result = method.invoke(object, args);
        System.out.println("after proxy!");
        return result;
    }
}