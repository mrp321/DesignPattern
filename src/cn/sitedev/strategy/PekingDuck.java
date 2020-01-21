package cn.sitedev.strategy;

public class PekingDuck extends Duck {

	@Override
	public void display() {
		System.out.println("北京鸭");
	}

	// 因为北京鸭不能飞翔, 因此需要重写fly
	public void fly() {
		System.out.println("北京鸭不能飞翔");
	}
}
