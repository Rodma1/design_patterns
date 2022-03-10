package com.chen.建造者模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/11 0:10
 * @Description: product 单车产品
 */
public class Bike {
    // 车架
    private String frame;

    // 车座
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

}