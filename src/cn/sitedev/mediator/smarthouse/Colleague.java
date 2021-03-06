package cn.sitedev.mediator.smarthouse;

// 同事抽象类
public abstract class Colleague {

    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public String getName() {
        return this.name;
    }

    public abstract void sendMessage(int stateChange);

}
