package cn.sitedev.builder.improve;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    // 构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过setter传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程, 交给指挥者
    public House constructHouse() {
        this.houseBuilder.buildBasic();
        this.houseBuilder.buildWalls();
        this.houseBuilder.roofed();
        return this.houseBuilder.buildHouse();
    }

}
