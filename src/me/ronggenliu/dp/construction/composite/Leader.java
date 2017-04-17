package me.ronggenliu.dp.construction.composite;

import java.util.List;
import java.util.ArrayList;

public class Leader implements Worker {

	private List<Worker> workers = new ArrayList<Worker>();
	private String name;
	
	public Leader(String name) {
		super();
		this.name = name;
	}
	
	public void add(Worker worker) {
		this.workers.add(worker);
	}
	
	public void remove(Worker worker) {
		this.workers.remove(worker);
	}
	
	public Worker get(int i) {
		return this.workers.get(i);
	}

	@Override
	public void doAction() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("My name is " + this.name + ", I'm a leader, I have " + this.workers.size() + " subordinates. they are:\n");
		sBuilder.append("-------------\n");
//		for(Worker worker: this.workers) {
//			sBuilder.append(worker.toString() + "\n");
//		}
		this.workers.forEach(worker -> sBuilder.append(worker.toString() + "\n"));
		sBuilder.append("-------------\n");
		return sBuilder.toString();
	}
	
	
	
}
