package com.chen.行为型模式.观察者模式.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyunzhi
 * @date 2024/6/5 17:21
 * @Description 实现主题
 */
public class SubjectImpl implements Subject{

    /**
     * 同步锁
     */
    private final Object SUB= new Object();

    /**
     * 存储注册的观察者
     */
    private final List<Observer> observers = new ArrayList<>();

    /**
     * 要通知的消息
     */
    private String message;

    /**
     * 防止 notifyObservers方法被外部调用发送错误通知
     */
    private boolean flag;

    @Override
    public void register(Observer observer) {
        if (observer != null) {
            synchronized (SUB) {
                // 如果不在就存储
                if (!observers.contains(observer)) {
                    observers.add(observer);
                }
            }
        }
    }

    @Override
    public void unregister(Observer observer) {
        if (observer != null) {
            synchronized (SUB) {
                observers.remove(observer);
            }
        }
    }

    @Override
    public void notifyObservers() {

        List<Observer> objects = new ArrayList<>();
        //使用同步方法确保通知仅发送给新消息前注册的观察者
        synchronized (SUB) {
            if (!flag) {
                return;
            }
            objects = this.observers;
            this.flag = false;
        }
        for (Observer observer:objects) {
            // 通知观察者，有消息更新
            observer.update(this.message);
        }

    }

    /**
     * 自定义一个消息变更方法方便测试
     */
    public void updateMessage(String message) {
        System.out.println("消息有变更，通知注册的观察者");
        this.message = message;
        this.flag = true;
        // 通知
        notifyObservers();
    }
}
