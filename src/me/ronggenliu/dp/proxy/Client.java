package me.ronggenliu.dp.proxy;

public class Client {

	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		Subject proxy = new SubjectProxy(realSubject);
		proxy.process();
	}

}
