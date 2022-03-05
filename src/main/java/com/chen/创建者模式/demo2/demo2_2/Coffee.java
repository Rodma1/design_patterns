package com.chen.创建者模式.demo2.demo2_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 17:33
 * @Description:
 */
public abstract class Coffee {

    abstract String getName();

    public void addMile(){
        System.out.println("加奶");
    }

    public void addSugar() {
        System.out.println("加糖");
    }

}
