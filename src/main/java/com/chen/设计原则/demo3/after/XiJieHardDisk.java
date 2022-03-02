package com.chen.设计原则.demo3.after;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/2 10:05
 * @Description: 希捷硬盘
 */
public class XiJieHardDisk implements HardDisk{

    public void save(String data) {
        System.out.println("希捷硬盘:"+data);
    }

    public String get(){
        return "数据";
    }

}
