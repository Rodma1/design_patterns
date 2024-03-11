package com.chen.结构型模式.适配器模式.类适配器模式.demo3;

/**
 * 测试
 *
 * @author chenyunzhi
 * @date 2024/3/3 22:52
 */
public class Test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println("--类适配器--");

        InterfaceClassAdapterImpl interfaceAdapter = new InterfaceClassAdapterImpl();
        laptop.connect(interfaceAdapter.vgaAdapterHdmi());

        System.out.println("--对象适配器--");
        InterfaceObjectAdapterImpl interfaceObjectAdapter = new InterfaceObjectAdapterImpl(new Display());
        laptop.connect(interfaceObjectAdapter.vgaAdapterHdmi());
    }
}
