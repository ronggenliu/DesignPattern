package me.ronggenliu.dp.creation.builder;

/**
 * Created by garliu on 2017/5/29.
 */
public class ConcreteProduct1Builder extends ProductBuilder {
  @java.lang.Override
  public void buildPartA() {
    System.out.println("build part A");
  }

  @java.lang.Override
  public void buildPartB() {
    System.out.println("build part B");
  }

  @java.lang.Override
  public void buildPartC() {
    System.out.println("build part C");
  }

  // HookMethod
  @java.lang.Override
  public boolean needPartB() {
    return true;
  }
}
