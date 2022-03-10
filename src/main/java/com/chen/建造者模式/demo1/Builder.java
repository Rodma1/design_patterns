package com.chen.建造者模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/11 0:15
 * @Description: 抽象建造者类
 */
public abstract class Builder {
    Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
