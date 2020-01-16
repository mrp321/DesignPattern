package cn.sitedev.principle.ocp.improve;

import javax.print.attribute.standard.MediaSize.Other;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(new Rectangle());
        ge.drawShape(new Circle());
        ge.drawShape(new Triangle());
    }
}

// 这是一个用于绘图的类[ 使用方 ]
class GraphicEditor {
    // 接收Shape对象, 调用其draw方法
    public void drawShape(Shape s) {
        s.draw();
    }
}

// Shape 类, 基类
abstract class Shape {
    int m_type;

    public abstract void draw(); // 抽象的draw方法
}

// 矩形
class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

// 圆形
class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增三角形
class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

// 再新增一个图形
class OtherGraphic extends Shape {
    public OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}