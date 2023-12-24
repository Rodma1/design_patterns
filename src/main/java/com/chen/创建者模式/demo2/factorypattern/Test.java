package com.chen.创建者模式.demo2.factorypattern;

/**
 * 测试类
 *
 * @author chenyunzhi
 * @date 2023/12/24 21:02
 */
public class Test {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("pc", "17 GB", "1 TB");

        Computer laptop = ComputerFactory.getComputer("laptop", "32 GB", "512 GB");

        System.out.println("pc电脑 = " + pc);

        System.out.printf("laptop电脑 = " + laptop);
    }
}
