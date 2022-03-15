package com.chen.结构型模式.代理模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/12 17:09
 * @Description: 静态代理：测试类
 */
public class Client {
    public static void main(String[] args) {
        // 去代理地点买火车票
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
