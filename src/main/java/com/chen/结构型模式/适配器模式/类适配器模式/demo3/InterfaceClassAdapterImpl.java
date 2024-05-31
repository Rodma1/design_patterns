package com.chen.结构型模式.适配器模式.类适配器模式.demo3;

/**
 * 类适配器接口实现
 *
 * @author chenyunzhi
 * @date 2024/3/5 21:53
 */
public class InterfaceClassAdapterImpl extends Display implements InterfaceAdapter{
    @Override
    public InterfaceHdmi vgaAdapterHdmi() {
        System.out.println("vga接口转化为Hdmi接口");
        return "VGA".equals(getInterfaceType().type()) ? new InterfaceHdmi(): null;
    }
}
