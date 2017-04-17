package me.ronggenliu.dp.construction.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectHandler implements InvocationHandler {

	Subject realSubject = null;
	
	public SubjectHandler(Subject realSubject) {
		super();
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Dynamic Proxy - Before process");
//		if(realSubject == null) {
//			realSubject = new RealSubject();
//		}
//		realSubject.process();
		Object obj = method.invoke(realSubject, args);
		System.out.println("Dynamic Proxy - After process");
		return obj;
	}
}
