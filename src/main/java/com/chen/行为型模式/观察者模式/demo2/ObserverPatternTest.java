package com.chen.行为型模式.观察者模式.demo2;

/**
 * @author chenyunzhi
 * @date 2024/6/6 14:57
 * @Description 观察者模式测试
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        // 创建观察者并注册到主题
        SubjectImpl subject = new SubjectImpl();
        subject.register(new ObserverImpl("观察者1"));
        subject.register(new ObserverImpl("观察者2"));
        subject.register(new ObserverImpl("观察者3"));

        // 测试 更新消息
        subject.updateMessage("订阅的主题有消息更新了");

    }
}
