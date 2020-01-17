package cn.sitedev.decorator;

// 具体的Decorator, 这里就是调味品
public class Chocolate extends Decorator {
	public Chocolate(Drink drink) {
		super(drink);
		this.setDes(" 巧克力 ");
		this.setPrice(3.0f); // 调味品的价格
	}

}
