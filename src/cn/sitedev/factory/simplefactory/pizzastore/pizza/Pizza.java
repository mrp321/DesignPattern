package cn.sitedev.factory.simplefactory.pizzastore.pizza;

// 将Pizza类做成抽象的类
public abstract class Pizza {
	protected String name;

	// 准备原材料, 不同Pizza不一样, 因此, 我们做成抽象方法
	public abstract void prepare();

	public void bake() {
		System.out.println(name + " baking");
	}

	public void cut() {
		System.out.println(name + " cutting");
	}

	public void box() {
		System.out.println(name + " boxing");
	}

	public void setName(String name) {
		this.name = name;
	}
}
