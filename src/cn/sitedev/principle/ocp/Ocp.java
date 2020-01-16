package cn.sitedev.principle.ocp;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(new Rectangle());
        ge.drawShape(new Circle());
        ge.drawShape(new Triangle());
    }
}

// 这是一个用于绘图的类[ 适用方 ]
class GraphicEditor {
    // 接收Shape对象, 然后根据type, 来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    // 绘制三角形
    private void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }

    // 绘制圆形
    private void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    // 绘制矩形
    private void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

}

// Shape 类, 基类
class Shape {
    int m_type;
}

// 矩形
class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
}

// 圆形
class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
}

// 新增三角形
class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }
}