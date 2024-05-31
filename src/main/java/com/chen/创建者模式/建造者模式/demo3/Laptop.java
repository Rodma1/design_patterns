package com.chen.创建者模式.建造者模式.demo3;


/**
 * 笔记本构建  ConcreteBuilder
 *
 * @author chenyunzhi
 * @date 2024/2/25 21:48
 */
public class Laptop extends Computer {

    private final String memory;

    private final  String disk;

    private  Boolean isSpeaker;

    public Laptop(String memory, String disk) {
        this.memory = memory;
        this.disk = disk;

    }
    public Laptop(Computer computer) {
        this.memory = computer.memory();
        this.disk = computer.disk();
        this.isSpeaker = computer.isSpeaker();
    }



    @Override
    public String memory() {
        return this.memory;
    }

    @Override
    public String disk() {
        return this.disk;
    }

    @Override
    public Boolean isSpeaker() {
        return this.isSpeaker;
    }
}
