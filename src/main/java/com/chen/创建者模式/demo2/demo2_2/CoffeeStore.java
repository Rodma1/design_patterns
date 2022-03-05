package com.chen.创建者模式.demo2.demo2_2;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 17:42
 * @Description:
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){

        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();

        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        // 添加配料
        coffee.addMile();;
        coffee.addSugar();
        return coffee;

    }

}
