package me.ronggenliu.dp.construction.decorator;

public class ConcreteDecoratorB extends Decrator {

	public ConcreteDecoratorB(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	void additionBehavior() {
		System.out.println("additional Behavior B");
	}

	@Override
	void operation() {
		super.operation();
		additionBehavior();
	}

}
