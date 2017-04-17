package me.ronggenliu.dp.construction.composite;

public class Employe implements Worker {
	
	private String name;

	public Employe(String name) {
		super();
		this.name = name;
	}

	@Override
	public void doAction() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "My name is " + this.name + ", I'm an ordinary employe.";
	}

	@Override
	public Worker get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Worker worker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Worker worker) {
		// TODO Auto-generated method stub
		
	}

}
