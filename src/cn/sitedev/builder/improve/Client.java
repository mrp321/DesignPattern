package cn.sitedev.builder.improve;

public class Client {
    public static void main(String[] args) {
        // 盖普通房子
        CommonHouse ch = new CommonHouse();
        // 准备建造房子的指挥者
        HouseDirector hd = new HouseDirector(ch);

        // 完成盖房子, 返回产品(普通房子)
        House h = hd.constructHouse();
        System.out.println("common house = " + h);

        System.out.println("==========================");

        // 盖高楼
        HighBuilding hb = new HighBuilding();
        // 重置建造者
        hd.setHouseBuilder(hb);
        // 完成盖房子, 返回产品(高楼)
        h = hd.constructHouse();
        System.out.println("high building = " + h);
    }
}
