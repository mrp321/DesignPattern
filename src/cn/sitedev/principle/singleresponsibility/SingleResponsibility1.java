package cn.sitedev.principle.singleresponsibility;

public class SingleResponsibility1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("小轿车");
		vehicle.run("飞机");
	}
}

// 交通工具类
// 方式一:
// 1. 在方式1的run方法中, 违反了单一职责原则
// 2. 解决的方案非常简单, 根据交通工具运行的方式不同, 分解成不同的类即可
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上行驶");
	}
}