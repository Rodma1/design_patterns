package com.chen.创建者模式.建造者模式.demo2.before;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/11 22:26
 * @Description: 手机类
 */
public class Phone {
    // cpu
    private String cpu;
    // 主机
    private String mainboard;

    public Phone(String cpu, String mainboard ) {
        this.cpu = cpu;
        this.mainboard = mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    @Override
    public String toString() {
        return "Phone{" +cpu +","+ mainboard+"}";
    }
}
