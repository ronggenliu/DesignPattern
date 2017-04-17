package me.ronggenliu.dp.construction.decorator;

public class Client {

	public static void main(String[] args) {
		// transparent Decorator.
		Component concreteComponent = new ConcreteComponentA();
		Component decoratorA = new ConcreteDecoratorA(concreteComponent);
		// second decorate.
		Component decoratorAB = new ConcreteDecoratorB(decoratorA);
		decoratorA.operation();
		decoratorAB.operation();

		// semitransparent Decorator.
		ConcreteDecoratorC decoratorC = new ConcreteDecoratorC(concreteComponent);
		decoratorC.operation();
		decoratorC.additionBehavior();
	}

}
