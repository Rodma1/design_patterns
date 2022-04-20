package com.chen.行为型模式.观察者模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/4/6 16:21
 * @Description: 抽象主题类
 */
public interface Subject {
    //增加订阅者
    public void attach(Observer observer);

    //删除订阅者
    public void detach(Observer observer);


    //通知订阅者更新消息
    public void notify(String message);
}
