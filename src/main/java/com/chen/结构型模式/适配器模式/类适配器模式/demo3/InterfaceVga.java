package com.chen.结构型模式.适配器模式.类适配器模式.demo3;

/**
 * vga接口
 * @author chenyunzhi
 * @date 2024/3/5 21:44
 */
public class InterfaceVga implements InterfaceType{

    @Override
    public String type() {
        return "VGA";
    }
}
