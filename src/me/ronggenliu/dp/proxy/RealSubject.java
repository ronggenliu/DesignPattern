package me.ronggenliu.dp.proxy;

public class RealSubject implements Subject {

	@Override
	public void process() {
		System.out.println("process Real Subject");
	}

}
