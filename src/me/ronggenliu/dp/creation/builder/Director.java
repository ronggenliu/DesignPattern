package me.ronggenliu.dp.creation.builder;

/**
 * Created by garliu on 2017/5/29.
 */
public class Director {
  private ProductBuilder builder;

  public Director(ProductBuilder builder) {
    this.builder = builder;
  }

  public void setBuilder(ProductBuilder builder) {
    this.builder = builder;
  }

  public Product construct() {
    builder.buildPartA();
    if(builder.needPartB()) {
      builder.buildPartB();
    }
    builder.buildPartC();
    return builder.getResult();
  }
}
