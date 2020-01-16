package cn.sitedev.singleton.type4;

public class SingletonTest4 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("singleton1 == singleton2 ? " + (singleton1 == singleton2));
		System.out.println(
				"singleton1.hashCode() == singleton2.hashCode() ? " + (singleton1.hashCode() == singleton2.hashCode()));
	}
}

// 懒汉式(线程安全, 同步方法)
class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	// 提供一个静态的公有方法, 加入同步处理的代码, 解决线程安全问题
	// 即, 懒汉式
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
