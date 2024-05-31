package com.chen.创建者模式.demo2.abstractfactory;

/**
 * 电脑抽象工厂
 *
 * @author chenyunzhi
 * @date 2023/12/27 22:53
 */
public interface  ComputerAbstractFactory {
    /**
     * 创建华为电脑接口
     */
    public Computer createHuaWeiComputer();

    /**
     * 创建小米电脑接口
     */
    public Computer createXiaoMiComputer();
}
