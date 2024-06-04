package com.chen.行为型模式.责任链模式.demo;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

/**
 * @author chenyunzhi
 * @date 2024/6/4 16:48
 * @Description 测试
 */
public class ChainOfResponsibilityPatternTest {


    private DispenseChain chain;
    /**
     * 初始化atm分配链
     */
    public  ChainOfResponsibilityPatternTest() {
        this.chain = new Yuan100Dispenser();
        Yuan20Dispenser yuan20Dispenser = new Yuan20Dispenser();
        Yuan10Dispenser yuan10Dispenser = new Yuan10Dispenser();

        chain.setNextChain(yuan20Dispenser);
        yuan20Dispenser.setNextChain(yuan10Dispenser);
    }
    public static void main(String[] args) {
        ChainOfResponsibilityPatternTest patternTest = new ChainOfResponsibilityPatternTest();
        for (int i=0; i<3; i++){
            System.out.println("----------输入领取金额-----------");
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            if (amount % 10 != 0) {
                System.out.println("需要输入10的倍数的金额");
                continue;
            }
            patternTest.chain.dispense(amount);
            System.out.println("----------分配结束-----------");
        }

    }

}
