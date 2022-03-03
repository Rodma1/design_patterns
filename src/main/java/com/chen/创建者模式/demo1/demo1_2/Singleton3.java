package com.chen.创建者模式.demo1.demo1_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 16:08
 * @Description: 懒汉式 ：双重检查方式
 * 对于 `getInstance()` 方法来说，绝大部分的操作都是读操作，读操作是线程安全的，
 * 所以我们没必让每个线程必须持有锁才能调用该方法，我们需要调整加锁的时机。由此也产生了一种新的实现模式：双重检查锁模式
 */
public class Singleton3 {

    // 私有构造方法
    private Singleton3() {
        System.out.println("懒汉式 ： 双重检查方式");
    }

    // 在成员位置声明静态变量
    private static Singleton3 instance;

    // 对外提供静态方法获取该对象
    public static Singleton3 getInstance() {

        // 第一次判断，如果instance不为null,不进入枪锁阶段，直接返回实例
        if (instance == null) {
            synchronized (Singleton3.class) {
                // 抢到锁之后再次判断是否为null
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
