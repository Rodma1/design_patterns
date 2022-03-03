package com.chen.创建者模式.demo1.demo1_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 16:25
 * @Description: 懒汉式: 双重检查方式
 * 双重检查锁模式是一种非常好的单例实现模式，解决了单例、性能、线程安全问题，上面的双重检测锁模式看上去完美无缺，其实是存在问题，在多线程的情况下，可能会出现空指针问题，出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
 *
 * 要解决双重检查锁模式带来空指针异常的问题，只需要使用 `volatile` 关键字, `volatile` 关键字可以保证可见性和有序性。
 */
public class Singleton4 {

    // 私有构造方法
    private Singleton4() {}

    private static volatile Singleton4 instance;

    // 对外提供静态方法获取该对象
    public static Singleton4 getInstance() {

        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实际
        if(instance == null) {
            synchronized (Singleton4.class) {
                //抢到锁之后再次判断是否为空
                if(instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;

    }

}
