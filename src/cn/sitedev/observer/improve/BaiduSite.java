package cn.sitedev.observer.improve;

public class BaiduSite implements Observer {
    // 温度, 气压, 湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新天气情况, 是由 WeatherData来调用, 这里使用推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.display();
    }

    // 显示
    private void display() {
        System.out.println("======百度网站======");
        System.out.println("***今日 百度网站 气温:" + temperature + "***");
        System.out.println("***今日 百度网站 气压:" + pressure + "***");
        System.out.println("***今日 百度网站 湿度:" + humidity + "***");
    }

}
