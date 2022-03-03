package com.chen.创建者模式.demo1.demo1_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 15:59
 * @Description: 懒汉式 ：线程不安全
 * 从上面代码我们可以看出该方式在成员位置声明Singleton类型的静态变量，并没有进行对象的赋值操作，
 * 那么什么时候赋值的呢？当调用getInstance()方法获取Singleton类的对象的时候才创建Singleton类的对象，这样就实现了懒加载的效果。但是，如果是多线程环境，会出现线程安全问题。
 */
public class Singleton1 {

    // 构造私有方法
    private Singleton1(){
        System.out.println("懒汉式:线程不安全");
    }

    // 在成员位置声明静态变量
    private static Singleton1 instance;

    // 对外提供静态方法获取改对象
    public static Singleton1 getInstance(){

        if (instance == null){
            instance = new Singleton1();
        }
        return  instance;

    }

}
