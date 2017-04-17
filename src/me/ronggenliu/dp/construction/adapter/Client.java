package me.ronggenliu.dp.construction.adapter;

public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.process1();
		target.process2();
	}

}
