package com.chen.创建者模式.demo3.demo3_1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/8 0:26
 * @Description:具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
