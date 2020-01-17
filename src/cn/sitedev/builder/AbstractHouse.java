package cn.sitedev.builder;

public abstract class AbstractHouse {
    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    public void build() {
        this.buildBasic();
        this.buildWalls();
        this.roofed();
    }

}
