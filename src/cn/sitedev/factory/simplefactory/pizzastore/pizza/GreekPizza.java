package cn.sitedev.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		this.setName("GreekPizza");
		System.out.println(name + " preparing");
	}

}
