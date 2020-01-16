package cn.sitedev.singleton.type2;

public class SingletonTest2 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("singleton1 == singleton2 ? " + (singleton1 == singleton2));
		System.out.println(
				"singleton1.hashCode() == singleton2.hashCode() ? " + (singleton1.hashCode() == singleton2.hashCode()));
	}
}

// 饿汉式(静态代码块)
class Singleton {
	// 1. 构造器私有化, 防止外部通过new创建对象
	private Singleton() {

	}

	private static Singleton INSTANCE;

	// 2. 在静态代码块中, 创建单例对象
	static {
		INSTANCE = new Singleton();
	}

	// 3. 提供一个公有的静态方法, 返回实例对象
	public static Singleton getInstance() {
		return INSTANCE;

	}

}