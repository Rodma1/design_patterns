package com.chen.行为型模式.命令设计模式;

/**
 * @Author chenyunzhi
 * @DATE 2024/9/12 15:14
 * @Description: 使用左手接收者
 */
public class LeftHandPeopleReceiver implements BallReceiver{
    @Override
    public void passBall() {
        System.out.println("人物1使用左手传球");
    }
}
