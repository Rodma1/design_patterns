package com.chen.创建者模式.demo2.demo2_4;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/6 0:31
 * @Description: 甜品工厂
 */
public interface DessertFactory {
    // 咖啡工厂
    public Coffee createCoffee();

    // 甜品工厂
    public Dessert createDessert();

}
