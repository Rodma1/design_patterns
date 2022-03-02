package com.chen.设计原则.demo2.after;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/1 10:08
 * @Description: 长方形类
 */
public class Rectangle implements Quadrilateral{

    private double length;

    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
