package cn.sitedev.proxy.cglibproxy;

// cglib代理, 不需要实现接口
public class TeacherDao {

	public String teach() {
		System.out.println("TeacherDao.teach");
		return "hello";
	}

}
