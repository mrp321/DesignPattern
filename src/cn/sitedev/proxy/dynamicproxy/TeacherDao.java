package cn.sitedev.proxy.dynamicproxy;

public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		System.out.println("TeacherDao.teach");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("TeacherDao.sayHello:" + name);
	}

}
