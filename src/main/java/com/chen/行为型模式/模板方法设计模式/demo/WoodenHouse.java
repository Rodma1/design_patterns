package com.chen.行为型模式.模板方法设计模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/4 13:55
 * @Description
 */
public class WoodenHouse extends HouseTemplate{
    @Override
    public void pillars() {
        System.out.println("木头柱子弄好了");
    }

    @Override
    public void wall() {
        System.out.println("木头墙壁弄好了");
    }
    @Override
    public void window() {
        System.out.println("木头窗户弄好了");
    }
}
