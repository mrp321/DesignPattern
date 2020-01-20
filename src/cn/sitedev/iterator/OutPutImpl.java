package cn.sitedev.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    // 学院集合
    private List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院, 然后调用printDepartment输出各个学院的系
    public void printCollege() {
        // 从collegeList取出所有学院, Java中的List已经实现Iterator, 这里直接使用即可
        Iterator<College> iterator = this.collegeList.iterator();

        while (iterator.hasNext()) {
            // 取出一个学院
            College college = iterator.next();
            System.out.println("======" + college.getName() + "========");
            // 得到对应迭代器
            this.printDepartment(college.createIterator());
        }
    }

    // 输出学院的系
    public void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            Department department = iterator.next();
            System.out.println("<=" + department.getName() + "=>");
        }
    }
}
