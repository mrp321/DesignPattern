package cn.sitedev.factory.absfactory.pizzastore.order;

import cn.sitedev.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import cn.sitedev.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import cn.sitedev.factory.absfactory.pizzastore.pizza.Pizza;

// 工厂子类
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
