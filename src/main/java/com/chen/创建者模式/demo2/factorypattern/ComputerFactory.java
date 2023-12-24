package com.chen.创建者模式.demo2.factorypattern;

/**
 * @author chenyunzhi
 * @date 2023/12/24 20:56
 * @description 电脑工厂
 */
public class ComputerFactory {

    /**
     * 获取电脑
     * @param type 电脑类型
     * @param memory 内存
     * @param disk 磁盘
     * @return
     */

    private static final String PC = "pc";

    private static final String LAPTOP = "laptop";

    public static Computer getComputer(String type, String memory, String disk) {
        if (PC.equals(type)) {
            return new Pc(memory, disk);
        } else if (LAPTOP.equals(type)) {
            return new Laptop(memory, disk);
        } else {
            return null;
        }
    }

}
