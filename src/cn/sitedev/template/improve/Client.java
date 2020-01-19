package cn.sitedev.template.improve;

public class Client {
	public static void main(String[] args) {
		System.out.println("===========制作纯豆浆, 没有配料===========");
		SoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();

		System.out.println("==========制作花生豆浆===========");
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
	}
}
