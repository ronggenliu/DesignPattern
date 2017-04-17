package me.ronggenliu.dp.construction.bridge;

public class Client {

	public static void main(String[] args) {
		Implementor impl = new ConcreteImpl1();
		Implementor2 impl2 = new ConcreteImpl21();
		Abstraction abstraction = new RefineAbstraction(impl, impl2);
		abstraction.process();
		
		impl = new ConcreteImpl2();
		impl2 = new ConcreteImpl22();
		abstraction = new RefineAbstraction(impl, impl2);
		abstraction.process();
	}
}
