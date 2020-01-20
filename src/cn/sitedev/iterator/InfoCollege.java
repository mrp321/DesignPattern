package cn.sitedev.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
    private List<Department> departmentList;

    public InfoCollege() {
        this.departmentList = new ArrayList<Department>();
        this.addDepartment("信息安全专业", "信息安全专业");
        this.addDepartment("网络安全专业", "网络安全专业");
        this.addDepartment("服务器安全专业", "服务器安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院 ";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        this.departmentList.add(department);

    }

    @Override
    public Iterator<Department> createIterator() {
        return new InfoCollegeIterator(this.departmentList);
    }

}
