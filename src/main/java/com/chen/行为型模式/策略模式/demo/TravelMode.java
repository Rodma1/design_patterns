package com.chen.行为型模式.策略模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/5 11:30
 * @Description 出行方式
 */
public class TravelMode {

    // 抽象策略角色的引用
    private final Strategy strategy;

    public TravelMode(Strategy strategy) {
        this.strategy = strategy;
    }

    // 客户使用的出行方式
    public void way() {
        strategy.way();
    }
}
