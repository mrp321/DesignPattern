package cn.sitedev.decorator;

public class Decorator extends Drink {
	private Drink drink;

	public Decorator(Drink drink) {
		super();
		this.drink = drink;
	}

	@Override
	public float cost() {
		return super.getPrice() + this.drink.cost();
	}

	@Override
	public String getDes() {
		// 输出被装饰者的信息
		return this.des + " " + this.getPrice() + " && " + this.drink.getDes();
	}

}
