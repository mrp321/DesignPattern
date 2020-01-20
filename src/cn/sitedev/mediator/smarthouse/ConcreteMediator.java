package cn.sitedev.mediator.smarthouse;

import java.util.HashMap;

// 具体的中介者类
public class ConcreteMediator extends Mediator {
    // 集合, 放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        this.colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            this.interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            this.interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            this.interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            this.interMap.put("Curtains", colleagueName);
        }
    }

    // 具体中介者的核心方法
    // 1. 根据得到的消息, 完成对应任务
    // 2. 中介者在这个方法, 协调各个具体的同事对象, 完成任务
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        // 处理闹钟发出的消息
        if (this.colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine)(this.colleagueMap.get(this.interMap.get("CoffeeMachine")))).startCoffee();
                ((TV)(this.colleagueMap.get(this.interMap.get("TV")))).startTV();
            } else if (stateChange == 1) {
                ((TV)(this.colleagueMap.get(this.interMap.get("TV")))).stopTV();
            }
        } else if (this.colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains)(this.colleagueMap.get(this.interMap.get("Curtains")))).upCurtains();
        } else if (this.colleagueMap.get(colleagueName) instanceof TV) { // 如果是TV发送消息
            // 如果是电视发送的消息, 则在这里处理...
            if (stateChange == 0) {
                ((TV)(this.colleagueMap.get(this.interMap.get("TV")))).startTV();
            } else if (stateChange == 1) {
                ((TV)(this.colleagueMap.get(this.interMap.get("TV")))).stopTV();
            }
        } else if (this.colleagueMap.get(colleagueName) instanceof Curtains) {
            // 如果是窗帘发送的消息, 则在这里处理...
            ((Curtains)(this.colleagueMap.get(this.interMap.get("Curtains")))).upCurtains();
        }

    }

    @Override
    public void sendMessage() {

    }

}
