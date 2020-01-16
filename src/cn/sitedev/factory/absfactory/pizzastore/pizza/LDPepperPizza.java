package cn.sitedev.factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        this.setName("LDPepperPizza");
        System.out.println(name + " preparing");
    }

}
