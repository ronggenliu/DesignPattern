package me.ronggenliu.dp.construction.bridge;

public abstract class Abstraction {
	Implementor impl;
	Implementor2 impl2;

	public Abstraction(Implementor impl, Implementor2 impl2) {
		super();
		this.impl = impl;
		this.impl2 = impl2;
	}
	
	abstract void process();
}
