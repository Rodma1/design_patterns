package com.chen.结构型模式.适配器模式.类适配器模式.demo3;

/**
 * 只能连接hdmi的笔记本
 *
 * @author chenyunzhi
 * @date 2024/3/4 22:49
 */
public class Laptop {
    public void connect(InterfaceHdmi hdmi) {
        System.out.println("笔记本" + hdmi.type() + "连接成功");
    }
}
