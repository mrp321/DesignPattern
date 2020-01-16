package cn.sitedev.factory.simplefactory.pizzastore.order.improve;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import cn.sitedev.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	// 定义一个简单工厂对象
	private SimpleFactory simpleFactory;
	private Pizza pizza;

	// 构造器
	public OrderPizza(SimpleFactory simpleFactory) {
		this.setFactory(simpleFactory);
	}

	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";// 用户输入的
		this.simpleFactory = simpleFactory; // 设置简单工厂对象
		do {
			orderType = getType();
			this.pizza = this.simpleFactory.createPizza(orderType);
			// 输出pizza
			if (this.pizza != null) {
				this.pizza.prepare();
				this.pizza.bake();
				this.pizza.cut();
				this.pizza.box();
			} else {
				System.out.println("订购pizza失败");
				break;
			}
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
