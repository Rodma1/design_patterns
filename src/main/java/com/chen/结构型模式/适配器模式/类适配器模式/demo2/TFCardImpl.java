package com.chen.结构型模式.适配器模式.类适配器模式.demo2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/16 0:05
 * @Description:
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "这是TF卡";
    }
}
