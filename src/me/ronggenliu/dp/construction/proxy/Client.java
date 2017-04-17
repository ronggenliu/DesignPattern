package me.ronggenliu.dp.construction.proxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		Subject proxy = new SubjectProxy(realSubject);
		proxy.process();
		
		SubjectHandler subjectHandler = new SubjectHandler(realSubject);
		Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class}, subjectHandler);
		subject.process();
	}

}
