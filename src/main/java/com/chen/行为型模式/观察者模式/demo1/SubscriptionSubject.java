package com.chen.行为型模式.观察者模式.demo1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 那就叫小智吧
 * @date: 2022/4/6 16:23
 * @Description: 微信公众号是具体主题
 */
public class SubscriptionSubject implements Subject{
    // 存储订阅公众号的微信用户
     private List<Observer> weixinUserlist = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }



    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.updateNotify(message);
        }
    }
}
