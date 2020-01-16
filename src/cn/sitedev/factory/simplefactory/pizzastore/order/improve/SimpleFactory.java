package cn.sitedev.factory.simplefactory.pizzastore.order.improve;

import cn.sitedev.factory.simplefactory.pizzastore.pizza.CheesePizza;
import cn.sitedev.factory.simplefactory.pizzastore.pizza.GreekPizza;
import cn.sitedev.factory.simplefactory.pizzastore.pizza.PepperPizza;
import cn.sitedev.factory.simplefactory.pizzastore.pizza.Pizza;

// 简单工厂类
public class SimpleFactory {
	// 增加orderType返回对应的Pizza对象
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;

		System.out.println("使用简单工厂模式");
		if ("greek".equals(orderType)) {
			pizza = new GreekPizza();
		} else if ("cheese".equals(orderType)) {
			pizza = new CheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new PepperPizza();
		}
		return pizza;
	}

	// 简单工厂模式也叫静态工厂模式
	public static Pizza createPizza2(String orderType) {
		Pizza pizza = null;

		System.out.println("使用简单工厂模式");
		if ("greek".equals(orderType)) {
			pizza = new GreekPizza();
		} else if ("cheese".equals(orderType)) {
			pizza = new CheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new PepperPizza();
		}
		return pizza;
	}
}
