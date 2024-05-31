package com.chen.结构型模式.适配器模式.类适配器模式.demo3;

/**
 * 接口适配器
 *
 * @author chenyunzhi
 * @date 2024/3/5 21:49
 */
public interface InterfaceAdapter {

    /**
     * Hdmi转化成Vga
     * @return 输出vga接口
     */
    public InterfaceHdmi vgaAdapterHdmi();
}
