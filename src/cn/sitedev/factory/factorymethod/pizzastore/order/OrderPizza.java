package cn.sitedev.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import cn.sitedev.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {
    // 定义一个抽象方法, 让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType = null; // 订购的Pizza类型
        do {
            orderType = this.getType();
            pizza = this.createPizza(orderType);// 抽象方法,由工厂子类完成
            if (pizza != null) {
                // 输出pizza制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("暂不支持生产这样的pizza");
                break;
            }
         
        } while (true);
    }

    // 获取客户希望订购的Pizza种类
    public String getType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String type = br.readLine();
            return type;
        } catch (Exception e) {
            return "";
        }
    }
}
