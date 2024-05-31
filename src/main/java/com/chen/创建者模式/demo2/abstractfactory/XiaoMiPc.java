package com.chen.创建者模式.demo2.abstractfactory;

/**
 * 小米台式机
 *
 * @author chenyunzhi
 * @date 2023/12/27 0:23
 */
public class XiaoMiPc extends Computer{

    private final String memory;
    private final String disk;

    public  XiaoMiPc(String memory, String disk) {
        this.memory = memory;
        this.disk = disk;
    }

    @Override
    public String memory() {
        return this.memory;
    }

    @Override
    public String disk() {
        return this.disk;
    }
}
