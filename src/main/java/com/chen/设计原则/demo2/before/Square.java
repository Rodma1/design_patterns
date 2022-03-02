package com.chen.设计原则.demo2.before;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/2 0:08
 * @Description: 正方形
 */
public class Square extends Rectangle{

    // 设置正方形长宽都是width
    public void setWidth(double width){

        super.setWidth(width);
        super.setLength(width);

    }

    // 设置正方形长宽都是length
    public  void  setLength(double length){

        super.setWidth(length);
        super.setLength(length);

    }

}
