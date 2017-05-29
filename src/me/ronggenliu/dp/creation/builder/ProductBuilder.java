package me.ronggenliu.dp.creation.builder;

/**
 * Created by garliu on 2017/5/29.
 */
public abstract class ProductBuilder {
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public boolean needPartB(){
      return false;
    }

    public Product getResult() {
      return product;
    }
}
