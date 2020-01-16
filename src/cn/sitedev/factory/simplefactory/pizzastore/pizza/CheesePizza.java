package cn.sitedev.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		this.setName("CheesePizza");
		System.out.println(name + " preparing");
	}

}
