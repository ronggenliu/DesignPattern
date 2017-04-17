package me.ronggenliu.dp.construction.proxy;

public class SubjectProxy implements Subject {

	private Subject subject;
	
	
	public SubjectProxy(Subject subject) {
		super();
		this.setSubject(subject);
	}
	
	public SubjectProxy() {
		super();
	}

	@Override
	public void process() {
		System.out.println("Before process");
		// lazy loading.
		if(getSubject() == null) {
			setSubject(new RealSubject());
		}
		getSubject().process();
		System.out.println("After process");
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
