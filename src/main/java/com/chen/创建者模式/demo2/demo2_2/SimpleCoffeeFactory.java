package com.chen.创建者模式.demo2.demo2_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/5 21:33
 * @Description:
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {

        Coffee coffee = null;
        if ("中式咖啡".equals(type)){
            coffee = new ChinaCoffee();
        }else if ("小智咖啡".equals(type)) {
            coffee = new XiaoZhiCoffee();
        }

        return coffee;

    }

}
