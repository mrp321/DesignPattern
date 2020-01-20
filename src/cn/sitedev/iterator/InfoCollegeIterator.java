package cn.sitedev.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator<Department> {

    // 信息工程学院是以List方式存储的
    private List<Department> departmentList;

    private int index = -1; // 索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    // 判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= this.departmentList.size() - 1) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    // 获取list中的下一个元素
    @Override
    public Department next() {
        return this.departmentList.get(this.index);
    }

    // 空实现, remove
    public void remove() {

    }

}
