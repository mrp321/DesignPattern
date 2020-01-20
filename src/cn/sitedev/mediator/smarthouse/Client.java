package cn.sitedev.mediator.smarthouse;

public class Client {
    public static void main(String[] args) {
        // 创建一个中介者对象
        Mediator mediator = new ConcreteMediator();
        // 创建Alarm 并且加入到ConcreteMediator对象的HashMap中
        Alarm alarm = new Alarm(mediator, "alarm");

        // 创建CoffeeMachine对象, 并且加入到ConcreteMediator对象的HashMap中
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");

        // 创建Curtains对象, 并且加入到ConcreteMediator对象的HashMap中
        Curtains curtains = new Curtains(mediator, "curtains");

        // 创建TV对象, 并且加入到ConcreteMediator对象的HashMap中
        TV tv = new TV(mediator, "TV");
        System.out.println("===============alarm && coffeeMachine==============");
        // 让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
        System.out.println("================curtains============");
        curtains.sendMessage(0);
        curtains.sendMessage(1);
        System.out.println("================tv================");
        tv.sendMessage(0);
        tv.sendMessage(1);
    }
}
