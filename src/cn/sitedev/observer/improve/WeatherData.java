package cn.sitedev.observer.improve;

import java.util.ArrayList;
import java.util.List;

// 类是核心
// 1. 包含最新的天气情况信息
// 2. 含有观察者集合, 使用ArrayList管理
// 3. 当数据有更新时, 就主动的调用ArrayList, 通知所有的(接入方)就看到最新的信息
public class WeatherData implements Subject {
    // 温度, 气压, 湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 观察者集合
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    private void dataChange() {
        // 通知所有接入方(观察者)
        this.notifyObservers();
    }

    // 当数据有更新时, 就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 调用dataChange, 将最新的信息推送给接入方currentConditions
        this.dataChange();
    }

    // 注册一个观察者
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    // 移除一个观察者
    @Override
    public void removeObserver(Observer observer) {
        if (this.observers.contains(observer)) {
            this.observers.remove(observer);
        }
    }

    // 遍历所有的观察者, 并通知
    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }
}
