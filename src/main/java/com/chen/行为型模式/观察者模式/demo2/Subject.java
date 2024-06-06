package com.chen.行为型模式.观察者模式.demo2;

/**
 * @author chenyunzhi
 * @date 2024/6/5 17:13
 * @Description 主题
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void register(Observer observer);

    /**
     * 取消观察者
     */
    void unregister(Observer observer);

    /**
     * 通知观察者消息有更新
     */
    void notifyObservers();

}
