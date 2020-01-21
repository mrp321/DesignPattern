package cn.sitedev.strategy;

public class Client {
	public static void main(String[] args) {
		Duck pekingDuck = new PekingDuck();
		pekingDuck.quack();

		Duck toyDuck = new ToyDuck();
		toyDuck.quack();

		Duck wilDuck = new WildDuck();
		wilDuck.display();
	}

}
