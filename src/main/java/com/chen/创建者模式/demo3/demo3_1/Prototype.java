package com.chen.创建者模式.demo3.demo3_1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/8 0:25
 * @Description: 抽象原形类:规定了具体原型对象必须实现的的 clone() 方法。
 */
public interface Prototype {
    Prototype clone() throws CloneNotSupportedException;
}
