package com.chen.结构型模式.代理模式.demo2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/15 0:08
 * @Description: jdk代理类
 */
public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        ProxyFactory factory = new ProxyFactory();

        SellTickets proxyObjext = factory.getProxyObject();
        proxyObjext.sell();
    }
}
