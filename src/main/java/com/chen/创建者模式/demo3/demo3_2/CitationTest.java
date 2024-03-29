package com.chen.创建者模式.demo3.demo3_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/9 0:45
 * @Description: 原型模式，复制
 */
public class CitationTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Citation c1 = new Citation();
        c1.setName("小智");
        Citation c2 = c1.clone();
        System.out.println(c1.getClass()==c2.getClass());
        c2.setName("小陈");
        System.out.println(String.valueOf(c1.hashCode()));
        System.out.println(String.valueOf(c2.hashCode()));

        System.out.println(c1.getName().hashCode());

        System.out.println(c2.getName().hashCode());

        System.out.println(c1==c2);

    }

}
