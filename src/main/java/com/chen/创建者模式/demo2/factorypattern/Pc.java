package com.chen.创建者模式.demo2.factorypattern;

/**
 * @author chenyunzhi
 * @date 2023/12/24 20:48
 * @description 台式机
 */
public class Pc extends Computer{

    private final String memory;

    private final String disk;

    public Pc(String memory, String disk) {
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
