package com.chen.设计原则.demo6.before;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/2 13:50
 * @Description: 继承复用
 */
public class test {

    public static void main(String[] args) {
        new Car().type();
        new ElectricCar().type();
        new PetrolCar().type();

        // 每次增加一种颜色汽车都要在定义一个新的类（这就是继承复用，我们在after里面改为聚合复用）
        new RedElectricCar().type();
        new RedPetrolCar().type();
        new WhitePetrolCar().type();
    }

}
