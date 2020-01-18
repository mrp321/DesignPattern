package cn.sitedev.flyweight.jdkflyweight;

public class FlyWeight {
	public static void main(String[] args) {
		// 如果Integer.valueOf(x), x 在 -128~127之间, 就是使用享元模式返回, 如果不在范围内, 则仍然使用new方式创建对象

		// 小结
		// 1. 在valueOf方法中, 先判断值是否在IntegerCache中, 如果不在, 就创建新的Integer(new), 否则, 就直接从缓冲池返回
		// 2. valueOf方法, 就使用到了享元模式
		// 3. 如果使用valueOf方法得到一个Integer实例, 范围在-128~127之间, 执行速度比new快

		Integer x = Integer.valueOf(127); // 得到x实例, 类型Integer
		Integer y = new Integer(127); // 得到y实例, 类型Integer
		Integer z = Integer.valueOf(127);
		Integer w = new Integer(127);

		System.out.println("x.equals(y) ? " + (x.equals(y)));
		System.out.println("x == y ? " + (x == y));
		System.out.println("x == z ? " + (x == z));
		System.out.println("w == x ? " + (w == x));
		System.out.println("w == y ? " + (w == y));

		Integer x1 = Integer.valueOf(200);
		Integer x2 = Integer.valueOf(200);
		System.out.println("x1 == x2 ? " + (x1 == x2));

	}
}
