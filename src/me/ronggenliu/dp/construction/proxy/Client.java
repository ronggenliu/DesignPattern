package me.ronggenliu.dp.construction.proxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		Subject proxy = new SubjectProxy();
		proxy.process();
		
		SubjectHandler subjectHandler = new SubjectHandler();
		Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class}, subjectHandler);
		subject.process();
	}

}
