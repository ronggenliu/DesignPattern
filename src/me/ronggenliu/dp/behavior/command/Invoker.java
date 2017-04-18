package me.ronggenliu.dp.behavior.command;

public class Invoker {
	private Command command = null;
	
	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void call() {
		this.command.execute();
	}
}
