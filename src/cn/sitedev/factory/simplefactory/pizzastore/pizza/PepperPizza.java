package cn.sitedev.factory.simplefactory.pizzastore.pizza;

public class PepperPizza extends Pizza {

	@Override
	public void prepare() {
		this.setName("PepperPizza");
		System.out.println(name + " preparing");
	}

}
