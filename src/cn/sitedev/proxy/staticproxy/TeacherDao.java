package cn.sitedev.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		System.out.println("TeacherDao.teach");

	}

}
