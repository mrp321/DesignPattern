package cn.sitedev.factory.absfactory.pizzastore.order;

import cn.sitedev.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import cn.sitedev.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import cn.sitedev.factory.absfactory.pizzastore.pizza.Pizza;

// 工厂子类
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
