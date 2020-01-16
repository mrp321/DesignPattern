package cn.sitedev.singleton.type1;

public class SingletonTest1 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("singleton1 == singleton2 ? " + (singleton1 == singleton2));
		System.out.println(
				"singleton1.hashCode() == singleton2.hashCode() ? " + (singleton1.hashCode() == singleton2.hashCode()));

	}

}

// 饿汉式(静态变量)
class Singleton {
	// 1. 构造器私有化, 防止外部通过new来创建对象
	private Singleton() {

	}

	// 2. 本类内部创建对象实例
	private static final Singleton INSTANCE = new Singleton();

	// 3. 提供一个公有的静态方法, 返回实例对象
	public static Singleton getInstance() {
		return INSTANCE;
	}
}