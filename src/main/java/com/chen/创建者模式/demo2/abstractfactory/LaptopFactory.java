package com.chen.创建者模式.demo2.abstractfactory;

/**
 * 笔记本工厂
 *
 * @author chenyunzhi
 * @date 2023/12/27 23:08
 */
public class LaptopFactory implements ComputerAbstractFactory{

    private final String memory;
    private final String disk;

    public LaptopFactory(String memory, String disk) {
        this.memory = memory;
        this.disk = disk;
    }

    @Override
    public Computer createHuaWeiComputer() {
        return new HuaWeiLaptop(memory, disk);
    }

    @Override
    public Computer createXiaoMiComputer() {
        return new XiaoMiLaptop(memory, disk);
    }
}
