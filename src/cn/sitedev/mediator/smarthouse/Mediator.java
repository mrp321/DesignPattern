package cn.sitedev.mediator.smarthouse;

public abstract class Mediator {

    // 将中介者对象, 加入到集合中
    public abstract void register(String colleagueName, Colleague colleague);

    // 接收消息, 具体的同时对象发出
    public abstract void getMessage(int stateChange, String colleagueName);

    // 发送消息
    public abstract void sendMessage();
}
