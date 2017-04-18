package me.ronggenliu.dp.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {

	private List<Command> commands = new ArrayList<Command>();
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}
	
	public void removeCommand(Command command) {
		this.commands.remove(command);
	}
	
	public void execute() {
		this.commands.forEach(command -> command.execute());
	}
}
