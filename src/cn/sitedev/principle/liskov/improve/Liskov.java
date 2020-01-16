package cn.sitedev.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("========================");

        B b = new B();
        // 因为B类不再继承A类, 因此调用者, func1不再是求减法
        // 调用完成的功能就会很明确
        System.out.println("11+3=" + b.func1(11, 3)); // 这里本意是求出11+3的
        System.out.println("1+8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
        // 使用组合仍然可以使用到A类相关方法
        System.out.println("11-3=" + b.fun3(11, 3));
    }
}

// 创建一个更加基础的基类
class Base {
    // 把更加基础的方法和成员写到Base类
}

// A类继承Base类
class A extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类继承Base类
// 增加一个新功能:完成两个数相加, 然后和9求和
class B extends Base {

    // 如果B需要使用A类的方法, 使用组合关系
    private A a = new A();

    // 返回两个数的和
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    // 我们仍想使用A的方法
    public int fun3(int a, int b) {
        return this.a.func1(a, b);
    }
}