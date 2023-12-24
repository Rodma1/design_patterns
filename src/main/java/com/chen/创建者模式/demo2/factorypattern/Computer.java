package com.chen.创建者模式.demo2.factorypattern;

/**
 * @author chenyunzhi
 * @date 2023/12/24 20:39
 * @description 电脑抽象类
 */
public abstract class Computer {

    /**
     * 内存抽象方法
     * @return string
     */
    public abstract String memory();

    /**
     * 磁盘抽象方法
     * @return string
     */
    public abstract String disk();

    @Override
    public String toString() {
        return "内存:" + memory() + "  " + "磁盘:" + disk();
    }
}
