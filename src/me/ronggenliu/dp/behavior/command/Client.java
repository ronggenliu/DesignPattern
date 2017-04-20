package me.ronggenliu.dp.behavior.command;

public class Client {

	public static void main(String[] args) {
		Receiver receiver1 = new Receiver("receiver1");
		Receiver receiver2 = new Receiver("receiver2");
		Command concreteCommand1 = new ConcreteCommand(receiver1);
		Command concreteCommand2 = new ConcreteCommand(receiver2);
		CommandQueue commandQueue = new CommandQueue();
		commandQueue.addCommand(concreteCommand1);
		commandQueue.addCommand(concreteCommand2);
		Invoker invoker = new Invoker(commandQueue);
		invoker.call();
		invoker.undo();
	}
}
