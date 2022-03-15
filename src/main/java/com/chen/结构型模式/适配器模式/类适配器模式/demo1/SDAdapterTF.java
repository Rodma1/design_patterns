package com.chen.结构型模式.适配器模式.类适配器模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/16 0:06
 * @Description: 由于电脑只支持TF卡，所以我们需要一个适配器
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{


    @Override
    public String readSD() {
        return readTF();
    }
}
