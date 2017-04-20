package me.ronggenliu.dp.behavior.command;

public class ConcreteCommand extends Command {

	private Receiver receiver = null;
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	void execute() {
		this.receiver.action();
	}

	@Override
	void undo() {
		this.receiver.undo();
	}

}
