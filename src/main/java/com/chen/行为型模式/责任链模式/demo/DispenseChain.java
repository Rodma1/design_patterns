package com.chen.行为型模式.责任链模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/4 16:27
 * @Description 分配的处理链接口
 */
public interface DispenseChain {

    /**
     * 要执行的下一个链（对象）
     */
    void setNextChain(DispenseChain nextChain);


    /**
     * 执行分配的方法
     */
    void dispense(Integer amount);
}
