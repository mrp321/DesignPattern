package cn.sitedev.template.improve;

public class PureSoyaMilk extends SoyaMilk {

	@Override
	boolean customerWantCondiments() {
		return false;
	}

	@Override
	void addCondiments() {
		throw new UnsupportedOperationException("暂不支持添加配料");
	}

}
