package me.ronggenliu.dp.construction.proxy;

public class RealSubject implements Subject {

	@Override
	public void process() {
		System.out.println("process Real Subject");
	}
	
}
