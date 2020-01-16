package cn.sitedev.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import cn.sitedev.factory.simplefactory.pizzastore.pizza.CheesePizza;
import cn.sitedev.factory.simplefactory.pizzastore.pizza.GreekPizza;
import cn.sitedev.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

	// 构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType = null; // 订购Pizza的类型
		do {
			orderType = getType();
			if ("greek".equals(orderType)) {
				pizza = new GreekPizza();
			} else if ("cheese".equals(orderType)) {
				pizza = new CheesePizza();
			} else {
				break;
			}
			// 输出Pizza制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}

	// 写一个方法, 可以获取客户希望订购的Pizza种类
	private String getType() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type:  ");
			String type = br.readLine();
			return type;
		} catch (Exception e) {
			return "";
		}
	}
}
