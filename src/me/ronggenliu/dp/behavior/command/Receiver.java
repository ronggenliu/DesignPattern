package me.ronggenliu.dp.behavior.command;

public class Receiver {
	
	private String name = null;
	
	
	public Receiver(String name) {
		super();
		this.name = name;
	}

	public void action() {
		System.out.println("do action.[" + this.name + "]");
	}
}
