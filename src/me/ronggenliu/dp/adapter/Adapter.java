package me.ronggenliu.dp.adapter;

public class Adapter implements Target {

	Adaptee adaptee = new Adaptee();
	
	@Override
	public void process() {
		adaptee.specificProcess();
	}

}
