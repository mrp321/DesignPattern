package cn.sitedev.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        this.setName("BJCheesePizza");
        System.out.println(name + " preparing");
    }

}
