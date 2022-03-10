package com.chen.建造者模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/11 0:32
 * @Description: 客户
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new XiaozhiBuilder());
        // 单车
        Bike bike = director.construct();
        System.out.println(bike);
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
