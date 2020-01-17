package cn.sitedev.composite;

public class Department extends OrganizationComponent {

	// 没有集合

	public Department(String name, String des) {
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

	// add, remove 就不用写了, 因为它是叶子节点

	@Override
	protected void print() {
		System.out.println(getName());
	}

}
