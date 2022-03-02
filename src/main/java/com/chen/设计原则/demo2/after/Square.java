package com.chen.设计原则.demo2.after;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/2 9:34
 * @Description: 正方形
 */
public class Square  implements Quadrilateral{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
