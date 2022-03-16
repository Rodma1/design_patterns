package com.chen.结构型模式.适配器模式.类适配器模式.demo2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/17 0:55
 * @Description:
 */
public class SDAdapterTF implements SDCard{
    private TFCard tfCard;

    // 有参构造函数
    public SDAdapterTF(TFCard tfCard) {
        System.out.println("适配器读取TFcart");
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }
}
