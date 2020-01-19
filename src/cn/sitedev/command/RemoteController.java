package cn.sitedev.command;

public class RemoteController {

	// 开 按钮的命令数组
	Command[] onCommands;
	// 关 按钮的命令数组
	Command[] offCommands;

	// 执行撤销的命令
	Command undoCommand;

	// 构造器, 完成对按钮初始化
	public RemoteController() {
		this.onCommands = new Command[5];
		this.offCommands = new Command[5];

		for (int i = 0; i < 5; i++) {
			this.onCommands[i] = new NoCommand();
			this.offCommands[i] = new NoCommand();
		}
	}

	// 给按钮设置需要的命令
	public void setCommand(int no, Command onCommand, Command offCommand) {
		this.onCommands[no] = onCommand;
		this.offCommands[no] = offCommand;
	}

	// 按下开按钮
	public void onButtonWasPushed(int no) {
		// 找到按下的开的按钮, 并调用对应方法
		this.onCommands[no].execute();
		// 记住这次的操作, 用于撤销
		this.undoCommand = this.onCommands[no];
	}

	// 按下关按钮
	public void offButtonWasPushed(int no) {
		// 找到按下的关的按钮, 并调用对应方法
		this.offCommands[no].execute();
		// 记住这次的操作, 用于撤销
		this.undoCommand = this.offCommands[no];
	}

	// 按下撤销按钮
	public void undoButtonWasPushed() {
		this.undoCommand.undo();
	}
}
