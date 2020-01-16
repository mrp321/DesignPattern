package cn.sitedev.singleton.type6;

public class SingletonTest6 {
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
	private static volatile Singleton instance;

	private Singleton() {
	}

	// 提供一个静态的公有方法, 加入双重检查代码, 解决线程安全问题, 同时解决懒加载问题
	// 同时保证了效率, 建议使用
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}