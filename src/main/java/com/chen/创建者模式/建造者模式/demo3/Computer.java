package com.chen.创建者模式.建造者模式.demo3;

/**
 * 抽象接口
 *
 * @author chenyunzhi
 * @date 2024/2/25 21:44
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

    /**
     * 喇叭抽象方法
     * @return Boolean
     */
    public abstract Boolean isSpeaker();

    @Override
    public String toString() {
        return "内存:" + memory() + "  " + "磁盘:" + disk() + "是否使用喇叭" + isSpeaker();
    }

}
