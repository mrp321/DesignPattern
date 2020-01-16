package cn.sitedev.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        this.setName("LDCheesePizza");
        System.out.println(name + " preparing");
    }

}
