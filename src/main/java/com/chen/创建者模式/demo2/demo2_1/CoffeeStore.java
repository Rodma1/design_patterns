package com.chen.创建者模式.demo2.demo2_1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/3 17:42
 * @Description:
 */
public class CoffeeStore {

    public Coffee orderCoffee(String name){

         Coffee coffee = null;
        if ("中式咖啡".equals(name)){
            coffee = new ChinaCoffee();
        }else if ("小智咖啡".equals(name)) {
            coffee = new XiaoZhiCoffee();
        }
        // 添加配料
        coffee.addMile();;
        coffee.addSugar();
        return coffee;

    }

}
