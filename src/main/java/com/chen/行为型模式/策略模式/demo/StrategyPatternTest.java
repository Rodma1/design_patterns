package com.chen.行为型模式.策略模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/5 11:29
 * @Description
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        // 飞机出行
        TravelMode travelMode = new TravelMode(new Plane());
        travelMode.way();
        // 高铁出行
        TravelMode travelMode1 = new TravelMode(new RailWay());
        travelMode1.way();
    }
}
