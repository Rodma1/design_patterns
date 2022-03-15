package com.chen.结构型模式.适配器模式.类适配器模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/16 0:00
 * @Description: 类适配器模式
 */
public class ClientAdapter {
    public static void main(String[] args) {
        Computer computer = new Computer();

        SDCard sdCard = new SDcardImpl();

        System.out.println(computer.readSD(sdCard));

        SDAdapterTF adapterTF = new SDAdapterTF();

        System.out.println(computer.readSD(adapterTF));

    }
}
