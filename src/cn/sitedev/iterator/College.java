package cn.sitedev.iterator;

import java.util.Iterator;

// 学院
public interface College {
    String getName();

    // 增加系的方法
    void addDepartment(String name, String desc);

    // 返回一个迭代器, 遍历
    Iterator<Department> createIterator();
}
