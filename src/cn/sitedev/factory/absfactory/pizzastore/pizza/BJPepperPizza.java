package cn.sitedev.factory.absfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        this.setName("BJPepperPizza");
        System.out.println(name + " preparing");
    }

}
