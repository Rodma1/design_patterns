package com.chen.创建者模式.demo2.demo2_3;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/5 22:42
 * @Description: 具体工厂
 */
public class XiaoZhiCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new XiaoZhiCoffee();
    }
}
