package com.chen.创建者模式.demo2.abstractfactory;

/**
 * 小米笔记本
 *
 * @author chenyunzhi
 * @date 2023/12/27 0:30
 */
public class XiaoMiLaptop extends Computer{

    private final String memory;
    private final String disk;

    public XiaoMiLaptop(String memory, String disk) {
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
