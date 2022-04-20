package com.chen.行为型模式.观察者模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/4/6 16:11
 * @Description: 定义抽象观察者类
 */
public interface Observer {
    // 更新通知
    void updateNotify(String message);

}
