package com.chen.行为型模式.命令设计模式;

/**
 * @Author chenyunzhi
 * @DATE 2024/9/12 15:16
 * @Description: 使用右手接收者
 */
public class RightHandPeopleReceiver implements BallReceiver{
    @Override
    public void passBall() {
        System.out.println("人物2使用右手传球");
    }
}
