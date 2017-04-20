package me.ronggenliu.dp.behavior.command;

public abstract class Command {

	abstract void execute();
	abstract void undo();
}
