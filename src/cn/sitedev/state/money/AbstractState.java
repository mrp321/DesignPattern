package cn.sitedev.state.money;

//抽象类, 默认实现了State接口的所有方法
// 该类的所有方法, 其子类(具体的状态类), 可以有选择的进行重写
public class AbstractState implements State {
	protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

	@Override
	public void checkEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void checkFailEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void makePriceEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void acceptOrderEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void notPeopleAcceptEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void payOrderEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void orderFailEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void feedBackEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public String getCurrentState() {
		throw EXCEPTION;
	}

}

// 各种具体状态类
class FeedBackState extends AbstractState {

	@Override
	public String getCurrentState() {
		return StateEnum.FEED_BACKED.getValue();
	}

}

class ReviewState extends AbstractState {

	@Override
	public void makePriceEvent(Context context) {
		context.setState(new PublishState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.REVIEWED.getValue();
	}

}

class GenerateState extends AbstractState {

	@Override
	public void checkEvent(Context context) {
		context.setState(new ReviewState());
	}

	@Override
	public void checkFailEvent(Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.GENERATE.getValue();
	}

}

class PaidState extends AbstractState {

	@Override
	public void feedBackEvent(Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.PAID.getValue();
	}

}

class NotPayState extends AbstractState {

	@Override
	public void payOrderEvent(Context context) {
		context.setState(new PaidState());
	}

	@Override
	public void feedBackEvent(Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.NOT_PAY.getValue();
	}

}

class PublishState extends AbstractState {

	@Override
	public void acceptOrderEvent(Context context) {
		// 把当前状态设置为NotPayState
		// 至于应该变成哪个状态, 由流程图来决定
		context.setState(new NotPayState());
	}

	@Override
	public void notPeopleAcceptEvent(Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.PUBLISHED.getValue();
	}

}
