package com.chen.结构型模式.装饰者模式;

/**
 * @author chenyunzhi
 * @date 2024/6/3 16:32
 * @Description 金手链
 */
public class GoldBracelet extends BraceletDecorator{
    public GoldBracelet(Bracelet bracelet) {
        super(bracelet);
    }

    @Override
    public void color() {
        super.color();
        System.out.print(",增加金色");
    }
}
