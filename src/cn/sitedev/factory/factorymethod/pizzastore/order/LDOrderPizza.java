package cn.sitedev.factory.factorymethod.pizzastore.order;

import cn.sitedev.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import cn.sitedev.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import cn.sitedev.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
