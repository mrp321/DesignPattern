package cn.sitedev.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

// 客户端
public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("==============使用迪米特法则优化============");
        // 创建SchoolManager对象
        SchoolManager sm = new SchoolManager();
        // 输出学院的员工id和学校总部的员工信息
        sm.printAllEmployee(new CollegeManager());
    }
}

// 学校总部员工类
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

// 学院的员工类
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工的管理类
class CollegeManager {
    // 返回学院所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id = " + i);
            list.add(emp);
        }
        return list;
    }

    // 输出学院员工的信息
    public void printEmployee() {
        // 获取到学院员工
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("=======学院员工=========");
        for (CollegeEmployee ce : list1) {
            System.out.println(ce.getId());
        }
    }
}

// 学院管理类

// 分析 SchoolManager类的直接朋友类有哪些 Employee, CollegeManager
// CollegeEmployee 不是直接朋友, 而是一个陌生类, 这样违背了迪米特法则
class SchoolManager {
    // 返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        // 增加5个员工到list
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    // 该方法完成输出学校总部和学院员工信息(id)
    void printAllEmployee(CollegeManager cm) {
        // 分析问题
        // 1. 将输出学院的员工方法,封装到CollegeManager中
        cm.printEmployee();

        // 获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("===========学院总部员工===========");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
