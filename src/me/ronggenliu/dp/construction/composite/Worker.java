package me.ronggenliu.dp.construction.composite;

public interface Worker {

	void add(Worker worker);
	void remove(Worker worker);
	Worker get(int i);
	void doAction();
}
