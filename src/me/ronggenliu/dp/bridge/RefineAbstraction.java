package me.ronggenliu.dp.bridge;

public class RefineAbstraction extends Abstraction {

	public RefineAbstraction(Implementor impl, Implementor2 impl2) {
		super(impl, impl2);
	}

	@Override
	void process() {
		System.out.println("before impl.process");
		impl.implProcess();
		impl2.impl2process();
		System.out.println("after impl.process");
	}
}
