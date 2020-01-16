package cn.sitedev.principle.inversion.improve;

public class DependencyInversion {
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
		person.receive(new WeiXin());
	}
}

// 定义接口
interface IReceiver {
	String getInfo();
}

class Email implements IReceiver {

	@Override
	public String getInfo() {
		return "电子邮件信息: hello world!";
	}
}

// 增加微信
class WeiXin implements IReceiver {

	@Override
	public String getInfo() {
		return "微信信息: hello world!";
	}

}

// 方式2
class Person {

	// 这里我们是对接口的依赖
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}
