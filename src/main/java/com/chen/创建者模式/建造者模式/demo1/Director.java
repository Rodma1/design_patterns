package com.chen.创建者模式.建造者模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/11 0:19
 * @Description: 指挥者
 */
public class Director {
    private Builder mBuilder;

    // 传进来的是具体建造者类
    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    // 创建单车
    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
