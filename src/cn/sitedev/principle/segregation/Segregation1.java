package cn.sitedev.principle.segregation;

public class Segregation1 {

}

// 接口
interface Interface1 {
	void operation1();

	void operation2();

	void operation3();

	void operation4();

	void operation5();
}

class B implements Interface1 {

	@Override
	public void operation1() {
		System.out.println("B.operation1");
	}

	@Override
	public void operation2() {
		System.out.println("B.operation2");
	}

	@Override
	public void operation3() {
		System.out.println("B.operation3");
	}

	@Override
	public void operation4() {
		System.out.println("B.operation4");
	}

	@Override
	public void operation5() {
		System.out.println("B.operation5");
	}

}

class D implements Interface1 {

	@Override
	public void operation1() {
		System.out.println("D.operation1");
	}

	@Override
	public void operation2() {
		System.out.println("D.operation2");
	}

	@Override
	public void operation3() {
		System.out.println("D.operation3");
	}

	@Override
	public void operation4() {
		System.out.println("D.operation4");
	}

	@Override
	public void operation5() {
		System.out.println("D.operation5");
	}

}

// A 类通过接口Interface1依赖(即, 使用)B类, 但是只会使用其operation1, operation2, operation3 方法
class A {
	public void depend1(Interface1 i) {
		i.operation1();
	}

	public void depend2(Interface1 i) {
		i.operation2();
	}

	public void depend3(Interface1 i) {
		i.operation3();
	}
}

//C 类通过接口Interface1依赖(即, 使用)D类, 但是只会使用其operation1, operation4, operation5 方法
class C {
	public void depend1(Interface1 i) {
		i.operation1();
	}

	public void depend4(Interface1 i) {
		i.operation4();
	}

	public void depend5(Interface1 i) {
		i.operation5();
	}
}