package me.ronggenliu.dp.facade;

public class Client {

	public static void main(String[] args) {
		AbstractFacade facade = new Facade1();
		facade.wrappedOperation();
		
		facade = new Facade2();
		facade.wrappedOperation();
	}

}
