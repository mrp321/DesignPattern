package cn.sitedev.uml.composition.case1;

public class Person {
    private IDCard card; // 聚合关系
    private Head head = new Head(); // 组合关系
}
