package cn.sitedev.visitor;

import java.util.LinkedList;
import java.util.List;

// 数据库, 管理很多人(Man,Woman)
public class ObjectStructure {
	// 维护了一个集合
	private List<Person> persons = new LinkedList<>();

	// 增加到list
	public void attach(Person person) {
		this.persons.add(person);
	}

	// 从list中移除
	public void detach(Person person) {
		this.persons.remove(person);
	}

	// 显示测评情况
	public void display(Action action) {
		for (Person person : this.persons) {
			person.accept(action);
		}
	}
}
