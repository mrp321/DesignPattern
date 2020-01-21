package cn.sitedev.strategy.improve;

public class BadFlyBahavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("飞翔技术一般");
	}

}
