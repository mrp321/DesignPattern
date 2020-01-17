package cn.sitedev.decorator;

public class Soy extends Decorator {

	public Soy(Drink drink) {
		super(drink);
		this.setDes(" 豆浆 ");
		this.setPrice(1.5f);
	}

}
