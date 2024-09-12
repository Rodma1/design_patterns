package com.chen.行为型模式.命令设计模式;

/**
 * @Author chenyunzhi
 * @DATE 2024/9/12 16:36
 * @Description: 装配者  使用工厂模式设计
 */
public class PeopleReceiverClient {
    public static BallReceiver getBallReceiver(String people) {

        switch (people) {
            case "LEFT_HAND":
                return new LeftHandPeopleReceiver();
            case "RIGHT_HAND":
                return new RightHandPeopleReceiver();
            default:
                return null;
        }
    }
}
