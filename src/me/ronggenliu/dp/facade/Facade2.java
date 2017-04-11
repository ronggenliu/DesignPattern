package me.ronggenliu.dp.facade;

public class Facade2 extends AbstractFacade {
	SubSystem2 subSys2 = new SubSystem2();

	@Override
	void wrappedOperation() {
		System.out.println("Facade2");
		subSys2.process();
	}

}
