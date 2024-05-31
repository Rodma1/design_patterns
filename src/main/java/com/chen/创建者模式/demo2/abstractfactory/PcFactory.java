package com.chen.创建者模式.demo2.abstractfactory;

/**
 * 台式机工厂
 *
 * @author chenyunzhi
 * @date 2023/12/27 21:57
 */
public class PcFactory implements ComputerAbstractFactory{

    private final String memory;

    private final String disk;

    public PcFactory(String memory, String disk) {
        this.memory = memory;
        this.disk = disk;
    }

    @Override
    public Computer createHuaWeiComputer() {
        return new HuaWeiPc(memory, disk);
    }

    @Override
    public Computer createXiaoMiComputer() {
        return new XiaoMiPc(memory, disk);
    }
}
