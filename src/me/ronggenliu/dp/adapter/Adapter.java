package me.ronggenliu.dp.adapter;

public class Adapter extends AbstractAdapter {

	Adaptee adaptee = new Adaptee();
	
	@Override
	public void process1() {
		adaptee.specificProcess();
	}
}
