package com.chen.创建者模式.建造者模式.demo2.after;



/**
 * @author: 那就叫小智吧
 * @date: 2022/3/11 22:35
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("华硕")
                .build();
        System.out.println(phone);

    }
}
