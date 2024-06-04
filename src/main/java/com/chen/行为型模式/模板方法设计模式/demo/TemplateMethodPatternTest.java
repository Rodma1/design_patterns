package com.chen.行为型模式.模板方法设计模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/4 13:58
 * @Description
 */
public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        System.out.println("------------搭建木头房子-----------");
        WoodenHouse woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

        System.out.println("------------搭建玻璃房子-----------");
        GlassHouse glassHouse = new GlassHouse();
        glassHouse.buildHouse();

    }
}
