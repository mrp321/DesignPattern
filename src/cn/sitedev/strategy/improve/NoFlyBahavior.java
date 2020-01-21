package cn.sitedev.strategy.improve;

public class NoFlyBahavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("不会飞翔");
	}

}
