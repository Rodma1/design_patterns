package com.chen.设计原则.demo2.after;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/2 0:13
 * @Description: 里氏代换原则
 */
public class RectangleDemo {

    public static void main(String[] args) {

        // 设置长方形的长宽
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(5);

        // 转换大小
        resize(rectangle);
        printLengthAndWidth(rectangle); // 长:10.0   宽:11.0

        // 设置正方形
        Square square = new Square();
        square.setSide(6);

        System.out.println(square.getLength());




    }

    // 设置大小
    public static void resize(Rectangle rectangle){

        // 假设宽度永远比度大1
        while(rectangle.getWidth()<=rectangle.getLength()){

            rectangle.setWidth(rectangle.getWidth()+1);

        }

    }

    // 打印长方形的宽度
    public static void printLengthAndWidth(Rectangle rectangle){

        System.out.println("长:"+rectangle.getLength());
        System.out.println("宽:"+rectangle.getWidth());

    }

}
