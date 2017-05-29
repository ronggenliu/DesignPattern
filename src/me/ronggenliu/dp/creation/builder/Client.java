package me.ronggenliu.dp.creation.builder;

/**
 * Created by garliu on 2017/5/29.
 */
public class Client {
  public static void main(String args[]) {
    ConcreteProduct1Builder concreteBuilder = new ConcreteProduct1Builder();
    Director director = new Director(concreteBuilder);
    Product product = director.construct();
  }

}
