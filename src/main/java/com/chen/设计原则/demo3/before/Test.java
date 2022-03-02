package com.chen.设计原则.demo3.before;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/2 10:16
 * @Description: 依赖倒转原则
 */
public class Test {

    public static void main(String[] args) {

        // 创建computer对象
        Computer computer=new Computer();
        computer.setHardDisk(new XiJieHardDisk());
        computer.getHardDisk().save("数据");
        System.out.println(computer.getHardDisk().get());
    }

}
