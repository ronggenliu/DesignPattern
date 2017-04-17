package me.ronggenliu.dp.construction.composite;

public class Client {

	public static void main(String[] args) {
		Worker employe1 =  new Employe("employe1");
		employe1.doAction();
		Worker employe2 = new Employe("employ2");
		employe2.doAction();
		Worker employe3 = new Employe("employe3");
		employe3.doAction();
		Worker leader1 = new Leader("leader1");
		leader1.add(employe1);
		leader1.add(employe2);
		leader1.doAction();
	}

}
