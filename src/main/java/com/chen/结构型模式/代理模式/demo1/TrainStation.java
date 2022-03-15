package com.chen.结构型模式.代理模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/12 17:06
 * @Description: 火车站买票
 */
public class TrainStation implements SellTickets{

    @Override
    public void sell() {
        System.out.println("火车站买票");
    }

}
