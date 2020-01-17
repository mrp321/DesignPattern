package cn.sitedev.builder.improve;

public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        this.house.setBase("high building base");
        System.out.println("HighBuilding.buildBasic");
    }

    @Override
    public void buildWalls() {
        this.house.setWall("high building wall");
        System.out.println("HighBuilding.buildWalls");
    }

    @Override
    public void roofed() {
        this.house.setRoof("high building roof");
        System.out.println("HighBuilding.roofed");
    }

}
