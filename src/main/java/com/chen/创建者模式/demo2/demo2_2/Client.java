package com.chen.创建者模式.demo2.demo2_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 17:47
 * @Description: 工厂方法模式
 */
public class Client {
    public static void main(String[] args) {

        // 创建咖啡店
        CoffeeStore coffeeStore = new CoffeeStore();

        // 点咖啡
        Coffee coffee = coffeeStore.orderCoffee("小智咖啡");

        System.out.println(coffee.getName());
    }

}
