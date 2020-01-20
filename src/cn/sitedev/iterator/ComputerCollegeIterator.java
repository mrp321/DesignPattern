package cn.sitedev.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator<Department> {
    // 这里我们需要Department以数组方式进行存放
    private Department[] departments;
    private int pos = 0; // 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    // 判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if (this.pos >= this.departments.length || this.departments[this.pos] == null) {
            return false;
        }
        return true;
    }

    // 获取下一个元素
    @Override
    public Department next() {
        Department department = this.departments[this.pos];
        this.pos++;
        return department;
    }

}
