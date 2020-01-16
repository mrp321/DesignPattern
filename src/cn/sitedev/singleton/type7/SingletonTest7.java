package cn.sitedev.singleton.type7;

public class SingletonTest7 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("singleton1 == singleton2 ? " + (singleton1 == singleton2));
		System.out.println(
				"singleton1.hashCode() == singleton2.hashCode() ? " + (singleton1.hashCode() == singleton2.hashCode()));
	}
}

// 静态内部类完成, 推荐使用
class Singleton {

	// 构造器私有化
	private Singleton() {
	}

	// 写一个静态内部类, 该类中有一个静态属性Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}

	// 提供一个静态的公有方法, 直接返回SingletonInstance.INSTANCE
	public static synchronized Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}