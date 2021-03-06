package cn.sitedev.strategy.improve;

public abstract class Duck {
	// 属性, 策略接口
	protected FlyBehavior flyBehavior;
	// 其他属性, 策略接口
	protected QuackBehavior quackBehavior;

	public abstract void display(); // 显示鸭子信息

	public void quack() {
		System.out.println("鸭子嘎嘎叫");
	}

	public void swim() {
		System.out.println("鸭子会游泳");
	}

	public void fly() {
		// 改进
		if (flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
