package com.chen.行为型模式.策略模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/5 11:27
 * @Description 铁路
 */
public class RailWay implements Strategy {

    @Override
    public void way() {
        System.out.println("高铁出行");
    }
}
