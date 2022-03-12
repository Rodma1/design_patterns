package com.chen.创建者模式.建造者模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/11 0:28
 * @Description: 具体建造者类
 */
public class XiaozhiBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("软垫座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
