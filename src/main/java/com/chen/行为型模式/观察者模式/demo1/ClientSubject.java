package com.chen.行为型模式.观察者模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/4/6 16:35
 * @Description:
 */
public class ClientSubject {
    public static void main(String[] args) {
        // 具体工厂
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        // 创建微信用户
        WeixinUser user1=new WeixinUser("孙悟空");
        WeixinUser user2=new WeixinUser("猪悟能");
        WeixinUser user3=new WeixinUser("沙悟净");
        //订阅公众号
        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        subscriptionSubject.attach(user3);
        // 公众号更新发出消息给订阅的用户
        subscriptionSubject.notify("西天取经看到白骨精");
    }
}
