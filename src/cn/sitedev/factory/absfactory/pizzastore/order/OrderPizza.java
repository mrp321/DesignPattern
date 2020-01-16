package cn.sitedev.factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import cn.sitedev.factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {
    private AbsFactory absFactory;

    // 构造器
    public OrderPizza(AbsFactory factory) {
        this.setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = null; // 订购的Pizza类型
        this.absFactory = factory;
        do {
            orderType = this.getType();
            pizza = factory.createPizza(orderType); // 可以是北京(BJ)或者是伦敦(LD)的工厂子类
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
