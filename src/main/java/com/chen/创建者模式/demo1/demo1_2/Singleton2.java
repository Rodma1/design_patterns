package com.chen.创建者模式.demo1.demo1_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 16:04
 * @Description: 懒汉式 ： 线程安全
 * 	该方式也实现了懒加载效果，同时又解决了线程安全问题。但是在getInstance()方法上添加了synchronized关键字，
 * 	导致该方法的执行效果特别低。从上面代码我们可以看出，其实就是在初始化instance的时候才会出现线程安全问题，一旦初始化完成就不存在了。
 */
public class Singleton2 {

    // 私有构造方法
    private Singleton2(){};

    // 在成员位置声明静态变量
    private static Singleton2 instance;

    // 对外提供静态方法获取对象
    public static synchronized Singleton2 getInstance(){

        if (instance != null) {
            instance = new Singleton2();
        }
        return  instance;

    }
}
