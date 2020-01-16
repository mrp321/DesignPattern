package cn.sitedev.principle.inversion.improve;

public class DependencyPass {

	public static void main(String[] args) {
		// 方式一:接口
		IOpenAndClose openAndClose = new OpenAndClose();
		openAndClose.open(new ITV() {
			@Override
			public void play() {
				System.out.println("长虹电视打开");
			}
		});
		System.out.println("===================================");
		// 方式二:构造方法
		IOpenAndClose2 openAndClose2 = new OpenAndClose2(new ITV() {
			@Override
			public void play() {
				System.out.println("TCL电视打开");
			}
		});
		openAndClose2.open();
		System.out.println("===================================");
		// 方式三:setter方法
		IOpenAndClose3 openAndClose3 = new OpenAndClose3();
		openAndClose3.setTv(new ITV() {
			@Override
			public void play() {
				System.out.println("康佳电视打开");
			}
		});
		openAndClose3.open();
	}

}

// 方式1： 通过接口传递实现依赖
// 开关的接口
interface IOpenAndClose {
	public void open(ITV tv); // 抽象方法,接收接口
}

interface ITV { // ITV接口
	public void play();
}

// 实现接口
class OpenAndClose implements IOpenAndClose {
	public void open(ITV tv) {
		tv.play();
	}
}

// 方式2: 通过构造方法依赖传递
interface IOpenAndClose2 {
	public void open(); // 抽象方法
}

interface ITV2 { // ITV接口
	public void play();
}

class OpenAndClose2 implements IOpenAndClose2 {
	public ITV tv;

	public OpenAndClose2(ITV tv) {
		this.tv = tv;
	}

	public void open() {
		this.tv.play();
	}
}

// 方式3 , 通过setter方法传递
interface IOpenAndClose3 {
	public void open(); // 抽象方法

	public void setTv(ITV tv);
}

interface ITV3 { // ITV接口
	public void play();
}

class OpenAndClose3 implements IOpenAndClose3 {
	private ITV tv;

	public void setTv(ITV tv) {
		this.tv = tv;
	}

	public void open() {
		this.tv.play();
	}
}