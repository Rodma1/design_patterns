package com.chen.行为型模式.模板方法设计模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/4 13:48
 * @Description 房子模板
 */
public abstract class HouseTemplate {


    /**
     * 定义构建房子步骤  final定义防止子类重写
     */
    public final void buildHouse() {
        // 地基
        foundation();
        // 柱子
        pillars();
        // 墙
        wall();
        // 窗户 默认玻璃
        window();
        System.out.println("房子搭建成功");
    }

    /**
     * 写成私有的防止被子类重写
     */
    private void foundation() {
        System.out.println("地基已经打好");
    }

    public abstract void pillars();

    public abstract void wall();

    public void window() {
        System.out.println("玻璃窗户");
    }

}
