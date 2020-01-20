package cn.sitedev.observer.improve;

// 接口, 让WeatherData 来实现
public interface Subject {
    // 注册
    void registerObserver(Observer observer);

    // 移除
    void removeObserver(Observer observer);

    // 通知
    void notifyObservers();
}
