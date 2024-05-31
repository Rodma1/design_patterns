package com.chen.创建者模式.demo2.abstractfactory;

/**
 * 电脑工厂
 *
 * @author chenyunzhi
 * @date 2023/12/27 23:11
 */
public class ComputerFactory {


    /**
     * 获取华为电脑
     */
    public static Computer getHuaWeiComputer(ComputerAbstractFactory factory) {
        return factory.createHuaWeiComputer();
    }

    /**
     * 获取小米电脑
     */
    public static Computer getXiaoMiComputer(ComputerAbstractFactory factory) {
        return factory.createXiaoMiComputer();
    }

}
