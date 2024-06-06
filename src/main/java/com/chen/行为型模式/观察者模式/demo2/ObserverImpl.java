package com.chen.行为型模式.观察者模式.demo2;

/**
 * @author chenyunzhi
 * @date 2024/6/5 17:59
 * @Description 观察者实现类
 */
public class ObserverImpl implements Observer{

    /**
     * 观察者名称
     */
    private final String observerName;
    public ObserverImpl(String name) {
        this.observerName = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(observerName + "接收到消息:" + msg);
    }
}
