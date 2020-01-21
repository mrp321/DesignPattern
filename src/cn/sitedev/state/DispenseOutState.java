package cn.sitedev.state;

// 奖品发放完毕状态
// 说明:当我们activity改变成DispenseOutState, 抽奖活动结束
public class DispenseOutState extends State {
	// 初始化时传入活动引用
	private RaffleActivity raffleActivity;

	public DispenseOutState(RaffleActivity raffleActivity) {
		super();
		this.raffleActivity = raffleActivity;
	}

	@Override
	public void deductMoney() {
		System.out.println("奖品发送完了, 请下次再参加");
	}

	@Override
	public boolean raffle() {
		System.out.println("奖品发送完了, 请下次再参加");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("奖品发送完了, 请下次再参加");
	}

}
