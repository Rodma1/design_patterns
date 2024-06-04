package com.chen.行为型模式.责任链模式.demo;

/**
 * @author chenyunzhi
 * @date 2024/6/4 16:30
 * @Description
 */
public class Yuan100Dispenser implements DispenseChain{

    private DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Integer amount) {
        if (amount >= 100) {
            int num = amount / 100;
            int remainder = amount % 100;
            System.out.println("分配了" + num + "张100元");
            // 进入下一个分配
            if (remainder != 0) {
                this.dispenseChain.dispense(remainder);
            }
        } else {
            this.dispenseChain.dispense(amount);
        }
    }
}
