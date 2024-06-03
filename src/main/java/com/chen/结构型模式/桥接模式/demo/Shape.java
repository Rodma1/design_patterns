package com.chen.结构型模式.桥接模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/5/31 17:02
 * @Description 定义形状的抽象接口
 */
abstract class Shape {

    protected Color color;
    public Shape(Color color) {
        this.color = color;
    }

    // 定义抽象画图方法
    abstract void draw();
}
