package cn.sitedev.state.money;

// 环境上下文
public class Context extends AbstractState {
	// 当前的状态state, 根据业务流程处理, 不停变化
	private State state;

	@Override
	public void checkEvent(Context context) {
		this.state.checkEvent(this);
		this.getCurrentState();
	}

	@Override
	public void checkFailEvent(Context context) {
		this.state.checkFailEvent(this);
		this.getCurrentState();
	}

	@Override
	public void makePriceEvent(Context context) {
		this.state.makePriceEvent(this);
		this.getCurrentState();
	}

	@Override
	public void acceptOrderEvent(Context context) {
		this.state.acceptOrderEvent(this);
		this.getCurrentState();
	}

	@Override
	public void notPeopleAcceptEvent(Context context) {
		this.state.notPeopleAcceptEvent(this);
		this.getCurrentState();
	}

	@Override
	public void payOrderEvent(Context context) {
		this.state.payOrderEvent(this);
		this.getCurrentState();
	}

	@Override
	public void orderFailEvent(Context context) {
		this.state.orderFailEvent(this);
		this.getCurrentState();
	}

	@Override
	public void feedBackEvent(Context context) {
		this.state.feedBackEvent(this);
		this.getCurrentState();
	}

	@Override
	public String getCurrentState() {
		System.out.println("当前状态为:" + this.state.getCurrentState());
		return this.state.getCurrentState();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
