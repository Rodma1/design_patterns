package com.chen.结构型模式.桥接模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/5/31 16:59
 * @Description 白色
 */
public class WhiteColor  implements Color{
    @Override
    public void applyColor() {
        System.out.println("白色");
    }
}
