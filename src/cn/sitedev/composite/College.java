package cn.sitedev.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

	// list中存放的Department
	private List<OrganizationComponent> organizationComponents = new ArrayList<>();

	// 构造器
	public College(String name, String des) {
		super(name, des);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDes() {
		return super.getDes();
	}

	// 重写add
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// 将来实际业务中, College的add和University的add不一定完全一样
		this.organizationComponents.add(organizationComponent);
	}

	// 重写remove
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		this.organizationComponents.remove(organizationComponent);
	}

	// print方法, 就是输出University包含的学院
	@Override
	protected void print() {
		System.out.println("=====================" + getName() + "==============");
		// 遍历organizationComponents
		for (OrganizationComponent organizationComponent : this.organizationComponents) {
			organizationComponent.print();
		}

	}

}
