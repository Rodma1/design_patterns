package com.chen.结构型模式.适配器模式.类适配器模式.demo3;

/**
 * 接口对象适配器实现
 *
 * @author chenyunzhi
 * @date 2024/3/5 22:14
 */
public class InterfaceObjectAdapterImpl implements InterfaceAdapter{

    private final Display display;

    public InterfaceObjectAdapterImpl(Display display) {
        this.display = display;
    }
    @Override
    public InterfaceHdmi vgaAdapterHdmi() {
        System.out.println("vga接口转化为Hdmi接口");
        return "VGA".equals(display.getInterfaceType().type()) ? new InterfaceHdmi(): null;
    }
}
