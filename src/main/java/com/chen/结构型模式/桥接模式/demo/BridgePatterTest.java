package com.chen.结构型模式.桥接模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/5/31 17:15
 * @Description
 */
public class BridgePatterTest {
    public static void main(String[] args) {
        CircleShape circleShape = new CircleShape(new BlackColor());
        circleShape.draw();
        RectangleShape rectangleShape = new RectangleShape(new WhiteColor());
        rectangleShape.draw();
    }
}
