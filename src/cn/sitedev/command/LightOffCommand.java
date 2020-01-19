package cn.sitedev.command;

public class LightOffCommand implements Command {

	// 聚合LightReceiver
	private LightReceiver light;

	public LightOffCommand(LightReceiver light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// 调用接收者方法
		this.light.off();
	}

	@Override
	public void undo() {
		// 调用接收者方法
		this.light.on();
	}
}
