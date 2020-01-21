package cn.sitedev.strategy.improve;

public class ToyDuck extends Duck {

	public ToyDuck() {
		flyBehavior = new NoFlyBahavior();
	}

	@Override
	public void display() {
		System.out.println("玩具鸭");
	}

	// 需要重写父类所有方法
	public void quack() {
		System.out.println("玩具鸭不能叫");
	}

	public void swim() {
		System.out.println("玩具鸭不会游泳");
	}
}
