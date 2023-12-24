package com.chen.创建者模式.demo2.factorypattern;

/**
 * @author chenyunzhi
 * @date 2023/12/24 20:52
 * @description 笔记本电脑
 */
public class Laptop extends Computer{

    private String memory;

    private String disk;

    public Laptop(String memory, String disk) {
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
