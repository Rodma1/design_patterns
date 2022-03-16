package com.chen.结构型模式.适配器模式.类适配器模式.demo2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/15 23:56
 * @Description:
 */
public class SDcardImpl implements SDCard {

    @Override
    public String readSD() {
        return "读取SD卡";
    }
}
