package com.chen.行为型模式.观察者模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/4/6 16:16
 * @Description: 微信用户是具体的观察者类
 */
public class WeixinUser implements Observer{

    // 用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void updateNotify(String message) {
        System.out.println("通知"+name+"更新了" + message);
    }
}
