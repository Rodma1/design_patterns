package com.chen.结构型模式.适配器模式.类适配器模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/15 23:57
 * @Description: 电脑只能读取SD卡
 */
public class Computer {
    public String readSD(SDCard sdCard) {
        return sdCard.readSD();
    }
}
