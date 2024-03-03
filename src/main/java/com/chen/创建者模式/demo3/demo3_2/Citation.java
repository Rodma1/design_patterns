package com.chen.创建者模式.demo3.demo3_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/9 0:43
 * @Description:
 */
public class Citation implements Cloneable{

    private String name;

    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
