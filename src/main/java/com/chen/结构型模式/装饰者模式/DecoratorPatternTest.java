package com.chen.结构型模式.装饰者模式;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author chenyunzhi
 * @date 2024/6/3 14:39
 * @Description
 */
public class DecoratorPatternTest {
    public static void main(String[] args) throws Exception{

        // 获取金手链对象
        Bracelet goldBracelet = new GoldBracelet(new BasicBracelet());
        goldBracelet.color();

        System.out.println("\n-----------------------");

        // 获取银手链对象
        Bracelet silverBracelet = new SilverBracelet(new BasicBracelet());
        silverBracelet.color();

        System.out.println("\n-----------------------");

        // 获取包含金色和银色的手链
        Bracelet goldSilverBracelet = new GoldBracelet(new SilverBracelet(new BasicBracelet()));
        goldSilverBracelet.color();
    }
}
