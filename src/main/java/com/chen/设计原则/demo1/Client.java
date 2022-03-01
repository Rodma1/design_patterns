package com.chen.设计原则.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/1 9:52
 * @Description: 王者皮肤展现设置
 */
public class Client {

    public static void main(String[] args) {

        // 创建王者平台对象
        WangZheInput wangZheInput = new WangZheInput();

        // 创建皮肤对象
        TestSKin sKin = new TestSKin();

        // 将皮肤输入到王者中展示
        wangZheInput.setSkin(sKin);

        // 显示皮肤
        wangZheInput.display();

    }

}
