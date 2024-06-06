package com.chen.行为型模式.观察者模式.demo2;

/**
 * @author chenyunzhi
 * @date 2024/6/5 17:14
 * @Description 观察者类
 */
public interface Observer {

    /**
     * 定义要更新的方法，由主题调用
     */
    void update(String msg);
}
