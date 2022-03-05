package com.chen.创建者模式.demo2.demo2_3;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 17:42
 * @Description: 咖啡店类
 */
public class CoffeeStore {
    // 创建抽象工厂
    private CoffeeFactory factory;
    // 增加相应的工厂类
    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        // 获取对应的工厂类
        Coffee coffee = factory.createCoffee();
        // 添加配料
        coffee.addMile();;
        coffee.addSugar();

        return coffee;

    }

}
