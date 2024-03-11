package com.chen.结构型模式.适配器模式.类适配器模式.demo3;

/**
 * 只有VGA接口的显示屏
 *
 * @author chenyunzhi
 * @date 2024/3/5 21:48
 */
public class Display {
    public InterfaceVga getInterfaceType() {
        return new InterfaceVga();
    }
}
