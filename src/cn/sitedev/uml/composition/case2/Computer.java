package cn.sitedev.uml.composition.case2;

public class Computer {
    private Mouse mouse = new Mouse(); // Mouse和Computer不能分离
    private Monitor monitor = new Monitor(); // Monitor和Computer不能分离
}
