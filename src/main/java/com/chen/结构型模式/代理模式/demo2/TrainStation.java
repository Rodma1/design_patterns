package com.chen.结构型模式.代理模式.demo2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/14 23:46
 * @Description:
 */
public class TrainStation implements SellTickets{

    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
