package com.chen.创建者模式.建造者模式.demo2.before;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/11 22:35
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        // 构建phone对象
        Phone phone = new Phone("intel","华硕");

        System.out.println(phone);

    }
}
