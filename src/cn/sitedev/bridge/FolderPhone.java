package cn.sitedev.bridge;

public class FolderPhone extends Phone {

    // 构造器
    public FolderPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("FolderPhone");
    }

    public void close() {
        super.close();
        System.out.println("FolderPhone");
    }

    public void call() {
        super.call();
        System.out.println("FolderPhone");
    }
}
