package com.chen.创建者模式.demo2.demo2_4;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/6 0:42
 * @Description: 美国甜品类
 */
public class AmericanDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new XiaoZhiCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
