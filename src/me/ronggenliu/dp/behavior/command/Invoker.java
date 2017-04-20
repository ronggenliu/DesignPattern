package me.ronggenliu.dp.behavior.command;

public class Invoker {
	private CommandQueue commandQueue = null;
	
	public Invoker(CommandQueue commandQueue) {
		super();
		this.commandQueue = commandQueue;
	}

	public void call() {
		this.commandQueue.execute();
	}
	
	public void undo() {
		this.commandQueue.undo();
	}
}
