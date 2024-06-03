package com.chen.结构型模式.桥接模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/5/31 17:01
 * @Description 黑色
 */
public class BlackColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("黑色");
    }
}
