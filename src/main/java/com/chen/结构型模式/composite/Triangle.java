package com.chen.结构型模式.composite;

/**
 * 三角形
 *
 * @author chenyunzhi
 * @date 2024/3/11 22:56
 */
public class Triangle implements Graph{
    @Override
    public void fillColor(String color) {
        System.out.println("给三角形填充了" + color);
    }
}
