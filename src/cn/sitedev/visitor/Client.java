package cn.sitedev.visitor;

public class Client {
	public static void main(String[] args) {
		// 创建ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();

		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());

		// 成功
		System.out.println("===============成功测评================");
		Success success = new Success();
		objectStructure.display(success);

		System.out.println("==============失败测评=============");

		Fail fail = new Fail();
		objectStructure.display(fail);

		System.out.println("===============待定测评================");
		Wait wait = new Wait();
		objectStructure.display(wait);

	}
}
