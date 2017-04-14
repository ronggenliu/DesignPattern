package me.ronggenliu.dp.proxy;

public class SubjectProxy implements Subject {

	private Subject subject;
	
	
	public SubjectProxy(Subject subject) {
		super();
		this.subject = subject;
	}

	@Override
	public void process() {
		System.out.println("Before process");
		subject.process();
		System.out.println("After process");
	}

}
