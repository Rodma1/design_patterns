package com.chen.结构型模式.装饰者模式;

/**
 * @author chenyunzhi
 * @date 2024/6/3 16:37
 * @Description 银手链
 */
public class SilverBracelet extends BraceletDecorator{
    public SilverBracelet(Bracelet bracelet) {
        super(bracelet);
    }

    @Override
    public void color() {
        super.color();
        System.out.print(",增加银色");
    }
}
