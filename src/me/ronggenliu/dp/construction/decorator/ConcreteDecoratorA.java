package me.ronggenliu.dp.construction.decorator;

public class ConcreteDecoratorA extends Decrator {

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	void additionBehavior() {
		System.out.println("additional Behavior A");
	}

	@Override
	void operation() {
		super.operation();
		additionBehavior();
	}

}
