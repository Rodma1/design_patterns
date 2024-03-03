package com.chen.创建者模式.建造者模式.demo3;

/**
 * @author chenyunzhi
 * @date 2024/2/25 22:40
 */
public class Test
{
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer("laptop",
                new ComputerBuilder.Builder("17 GB", "1TB").setIsSpeaker(true).build());

        Computer pc = ComputerFactory.getComputer("pc",
                new ComputerBuilder.Builder("17 GB", "1TB").build());

        System.out.println("pc电脑 = " + pc);

        System.out.printf("laptop电脑 = " + laptop);

    }
}
