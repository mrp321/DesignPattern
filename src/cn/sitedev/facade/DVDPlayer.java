package cn.sitedev.facade;

public class DVDPlayer {
	// 使用单例模式, 使用饿汉式
	private static DVDPlayer instance = new DVDPlayer();

	public static DVDPlayer getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("DVDPlayer.on");
	}

	public void off() {
		System.out.println("DVDPlayer.off");
	}

	public void play() {
		System.out.println("DVDPlayer.play");
	}

	public void pause() {
		System.out.println("DVDPlayer.pause");
	}

}
