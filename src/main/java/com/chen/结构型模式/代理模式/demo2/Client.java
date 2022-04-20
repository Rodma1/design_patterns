package com.chen.结构型模式.代理模式.demo2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/15 0:08
 * @Description: jdk代理类
 */
public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        // 1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();

        // 2. 使用factory对象的方法获取代理对象
        SellTickets proxyObjext = factory.getProxyObject();

        // 3. 调用定义的方法
        proxyObjext.sell();
    }
}
