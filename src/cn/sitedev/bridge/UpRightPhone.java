package cn.sitedev.bridge;

public class UpRightPhone extends Phone {

    // 构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("UpRightPhone");
    }

    public void close() {
        super.close();
        System.out.println("UpRightPhone");
    }

    public void call() {
        super.call();
        System.out.println("UpRightPhone");
    }

}
