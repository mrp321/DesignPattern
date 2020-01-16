package cn.sitedev.factory.absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        this.setName("LDCheesePizza");
        System.out.println(name + " preparing");
    }

}
