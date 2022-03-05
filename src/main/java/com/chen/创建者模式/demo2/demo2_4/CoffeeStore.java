package com.chen.创建者模式.demo2.demo2_4;


/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 17:42
 * @Description: 咖啡店类
 */
public class CoffeeStore {
    // 创建抽象工厂
    private DessertFactory factory;
    // 增加相应的工厂类
    public CoffeeStore(DessertFactory factory) {
        this.factory = factory;
    }

    public void orderCoffee(){
        // 获取对应的工厂类
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        // 添加配料
        coffee.addMile();;
        coffee.addSugar();
        System.out.println(coffee.getName());
        dessert.name();
        return;

    }

}
