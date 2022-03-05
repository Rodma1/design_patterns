package com.chen.创建者模式.demo2.demo2_4;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/6 0:45
 * @Description: 意大利甜品类
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new ChinaCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
