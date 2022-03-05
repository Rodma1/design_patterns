package com.chen.创建者模式.demo2.demo2_4;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 17:47
 * @Description: 工厂方法模式
 */
public class Client {
    public static void main(String[] args) {

        new CoffeeStore(new AmericanDessertFactory()).orderCoffee();


    }

}
