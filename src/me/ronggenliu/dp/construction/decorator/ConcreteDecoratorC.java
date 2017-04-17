package me.ronggenliu.dp.construction.decorator;

public class ConcreteDecoratorC extends Decrator {

	public ConcreteDecoratorC(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	void additionBehavior() {
		System.out.println("additional Behavior C");
	}
}
