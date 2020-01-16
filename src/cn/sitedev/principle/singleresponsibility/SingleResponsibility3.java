package cn.sitedev.principle.singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.run("小轿车");
		vehicle2.runAir("飞机");
	}
}

// 方案3的分析:
// 1. 这种修改方式没有对原来的类有大的修改, 只是增加方法
// 2. 这里虽然没有在类这个级别上遵守单一职责原则, 但是在方法级别上, 仍然是遵守单一职责的
class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上运行");
	}

	public void runAir(String vehicle) {
		System.out.println(vehicle + "在天上运行");
	}

	public void runWater(String vehicle) {
		System.out.println("在水上运行");
	}
}