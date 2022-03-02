package com.chen.设计原则.demo3.after;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/2 10:16
 * @Description: 依赖倒转原则
 * 高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象。简单的说就是要求对抽象进行编程，不要对实现进行编程，这样就降低了客户与实现模块间的耦合。
 */
public class Test {

    public static void main(String[] args) {

        // 创建computer对象
        Computer computer=new Computer();


        computer.setHardDisk(new XiJieHardDisk());
        computer.getHardDisk().save("数据");
        System.out.println(computer.getHardDisk().get());

        computer.setHardDisk(new XiaoHardDisk());
        computer.getHardDisk().save("数据");
        System.out.println(computer.getHardDisk().get());

    }

}
