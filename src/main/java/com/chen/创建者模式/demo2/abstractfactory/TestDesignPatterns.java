package com.chen.创建者模式.demo2.abstractfactory;

/**
 * 测试
 *
 * @author chenyunzhi
 * @date 2023/12/27 23:25
 */
public class TestDesignPatterns {
    public static void main(String[] args) {
        testDesignPatterns();
    }

    private static void testDesignPatterns() {
        Computer huaWeiComputer = ComputerFactory.getHuaWeiComputer(new PcFactory("32 GB", "1 TB"));
        System.out.println("华为pc电脑 = " + huaWeiComputer);
        Computer xiaoMiComputer = ComputerFactory.getXiaoMiComputer(new PcFactory("16 GB", "512 GB"));
        System.out.println("小米pc电脑 = " + xiaoMiComputer);

        Computer huaWeiComputer1 = ComputerFactory.getHuaWeiComputer(new LaptopFactory("8 GB", "1 TB"));
        System.out.println("华为笔记本电脑 = " + huaWeiComputer1);
        Computer xiaoMiComputer1 = ComputerFactory.getXiaoMiComputer(new LaptopFactory("4 GB", "512 GB"));
        System.out.println("小米笔记本电脑 = " + xiaoMiComputer1);
    }
}
