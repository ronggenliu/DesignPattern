package me.ronggenliu.dp.construction.decorator;

public class Decrator extends Component {
	
	Component component;

	public Decrator(Component component) {
		super();
		this.component = component;
	}

	@Override
	void operation() {
		component.operation();
	}

}
