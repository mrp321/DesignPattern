package cn.sitedev.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
    // 学院对应系的集合
    private Department[] departments;
    private int numOfDepts = 0; // 保存当前数组中对象的个数

    public ComputerCollege() {
        this.departments = new Department[5];
        this.addDepartment("Java专业", "Java专业");
        this.addDepartment("PHP专业", "PHP专业");
        this.addDepartment("大数据专业", "大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        this.departments[this.numOfDepts] = department;
        this.numOfDepts++;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(this.departments);
    }

}
