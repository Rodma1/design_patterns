package com.chen.结构型模式.桥接模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/5/31 17:07
 * @Description 圆形
 */
public class CircleShape extends Shape{
    public CircleShape(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("获得圆形的颜色是");
        color.applyColor();
    }
}
