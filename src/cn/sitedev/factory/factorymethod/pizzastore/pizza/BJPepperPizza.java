package cn.sitedev.factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        this.setName("BJPepperPizza");
        System.out.println(name + " preparing");
    }

}
