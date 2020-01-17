package cn.sitedev.builder.improve;

public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        this.house.setBase("common house base");
        System.out.println("CommonHouse.buildBasic");
    }

    @Override
    public void buildWalls() {
        this.house.setWall("common house wall");
        System.out.println("CommonHouse.buildWalls");
    }

    @Override
    public void roofed() {
        this.house.setRoof("common house roof");
        System.out.println("CommonHouse.roofed");
    }

}
