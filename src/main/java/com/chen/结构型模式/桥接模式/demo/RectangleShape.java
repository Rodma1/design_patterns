package com.chen.结构型模式.桥接模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/5/31 17:13
 * @Description 长方形
 */
public class RectangleShape extends Shape{
    public RectangleShape(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("获得长方形颜色是");
        color.applyColor();
    }
}
