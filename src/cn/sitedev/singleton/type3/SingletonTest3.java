package cn.sitedev.singleton.type3;

public class SingletonTest3 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("singleton1 == singleton2 ? " + (singleton1 == singleton2));
		System.out.println(
				"singleton1.hashCode() == singleton2.hashCode() ? " + (singleton1.hashCode() == singleton2.hashCode()));
	}
}

// 懒汉式(线程不安全)
class Singleton {
	// 1. 创建一个静态变量
	private static Singleton instance;

	// 2. 构造器私有化, 防止外部通过new创建对象
	private Singleton() {
	}

	// 3. 提供一个静态的公有方法, 当使用到该方法时, 才去创建instance
	// 即, 懒汉式
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
