package com.chen.结构型模式.composite;

/**
 * 圆形
 *
 * @author chenyunzhi
 * @date 2024/3/11 22:58
 */
public class Circle implements Graph{
    @Override
    public void fillColor(String color) {
        System.out.println("给圆形填充了" + color);
    }
}
