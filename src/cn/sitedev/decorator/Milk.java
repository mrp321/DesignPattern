package cn.sitedev.decorator;

public class Milk extends Decorator {

	public Milk(Drink drink) {
		super(drink);
		this.setDes(" 牛奶  ");
		this.setPrice(2.0f);
	}

}
