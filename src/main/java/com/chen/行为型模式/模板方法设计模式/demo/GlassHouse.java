package com.chen.行为型模式.模板方法设计模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/4 13:59
 * @Description 玻璃房子
 */
public class GlassHouse extends HouseTemplate{
    @Override
    public void pillars() {
        System.out.println("玻璃柱子弄好了");
    }

    @Override
    public void wall() {
        System.out.println("玻璃墙壁弄好了");
    }
}
