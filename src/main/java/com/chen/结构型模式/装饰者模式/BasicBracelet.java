package com.chen.结构型模式.装饰者模式;

/**
 * @author chenyunzhi
 * @date 2024/6/3 16:08
 * @Description 基本的手链，也就是白色
 */
public class BasicBracelet implements Bracelet{
    @Override
    public void color() {
        System.out.print("基本的白色手链");
    }
}
