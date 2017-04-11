package me.ronggenliu.dp.facade;

public class Facade1 extends AbstractFacade {
	SubSystem1 subSys1 = new SubSystem1();

	@Override
	void wrappedOperation() {
		System.out.println("Facade1");
		subSys1.process();
	}

}
