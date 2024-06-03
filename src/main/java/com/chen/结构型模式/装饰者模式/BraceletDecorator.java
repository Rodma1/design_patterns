package com.chen.结构型模式.装饰者模式;


/**
 * @author chenyunzhi
 * @date 2024/6/3 16:23
 * @Description 手链装饰器
 */
public class BraceletDecorator implements Bracelet {

    /**
     * 装饰器类应该可以访问组件变量，因此我们将保护该变量
     */
    protected Bracelet bracelet;

    public BraceletDecorator(Bracelet bracelet) {
        this.bracelet = bracelet;
    }

    @Override
    public void color() {
        this.bracelet.color();
    }
}
