package com.chen.创建者模式.demo2.demo2_3;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 17:47
 * @Description: 工厂方法模式
 */
public class Client {
    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore(new ChinaCoffeeFactory());

        // 咖啡类别
        Coffee coffee = coffeeStore.orderCoffee();

        // 产品类
        System.out.println(coffee.getName());


    }

}
