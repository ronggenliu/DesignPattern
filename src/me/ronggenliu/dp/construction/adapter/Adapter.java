package me.ronggenliu.dp.construction.adapter;

public class Adapter extends AbstractAdapter {

	Adaptee adaptee = new Adaptee();
	
	@Override
	public void process1() {
		adaptee.specificProcess1();
	}
}
