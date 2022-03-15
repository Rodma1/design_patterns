package com.chen.结构型模式.代理模式.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/12 17:07
 * @Description: 代理地点买票
 */
public class ProxyPoint implements SellTickets{
    private TrainStation station = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代理地点");
        station.sell();
    }
}
