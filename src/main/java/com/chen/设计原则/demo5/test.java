package com.chen.设计原则.demo5;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/2 11:10
 * @Description:
 */
public class test {

    public static void main(String[] args) {

        Agent agent = new Agent();

        agent.setStar(new Star("小智"));
        agent.setCompany(new Company("海南小智"));

        agent.business();
    }
}
