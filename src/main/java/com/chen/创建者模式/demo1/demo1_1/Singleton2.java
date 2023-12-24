package com.chen.创建者模式.demo1.demo1_1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 15:49
 * @Description: 饿汉式 : 在静态代码块中创建该类对象
 * 该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着类的加载而创建。所以和饿汉式的方式1基本上一样，当然该方式也存在内存浪费问题。
 */
public class Singleton2 {

    // 私有构造方法
    private Singleton2(){
        System.out.println("我是饿汉式： 在静态代码块中创建该类对象");
    };

    // 在成员位置声明静态变量
    private static Singleton2 instance;


    static {
        try {
            instance = new Singleton2();
        } catch (Exception e) {
            throw new RuntimeException("创建单例实例时发生异常");
        }
    }

    // 对外提供静态方法获取该对象
    public static Singleton2 getInstance(){
        return instance;
    }

}
