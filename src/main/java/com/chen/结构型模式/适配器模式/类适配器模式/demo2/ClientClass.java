package com.chen.结构型模式.适配器模式.类适配器模式.demo2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/17 0:58
 * @Description:
 */
public class ClientClass {
    public static void main(String[] args) {

        Computer computer = new Computer();
        SDCard sdCard = new SDcardImpl();
        System.out.println(computer.readSD(sdCard));

        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        System.out.println(sdAdapterTF.readSD());
        System.out.println(computer.readSD(sdAdapterTF));

    }
}
