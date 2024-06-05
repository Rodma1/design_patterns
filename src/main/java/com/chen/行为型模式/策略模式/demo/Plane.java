package com.chen.行为型模式.策略模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/5 11:28
 * @Description 飞机
 */
public class Plane implements Strategy {
    @Override
    public void way() {
        System.out.println("飞机出行");
    }
}
