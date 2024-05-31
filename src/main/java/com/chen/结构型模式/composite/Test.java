package com.chen.结构型模式.composite;

import java.util.ArrayList;

/**
 * 测试类
 *
 * @author chenyunzhi
 * @date 2024/3/11 23:11
 */
public class Test {
    public static void main(String[] args) {
        Diagram diagram = new Diagram(new ArrayList<>());

        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        diagram.add(triangle);
        diagram.add(circle);
        diagram.fillColor("绿色");

        diagram.delete(circle);
        diagram.fillColor("红色");

    }
}
