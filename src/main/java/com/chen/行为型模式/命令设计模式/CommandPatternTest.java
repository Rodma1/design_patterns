package com.chen.行为型模式.命令设计模式;

/**
 * @Author chenyunzhi
 * @DATE 2024/9/12 16:45
 * @Description:
 */
public class CommandPatternTest {
    public static void main(String[] args) {
        // 创建左手传球的接收者对象
        BallReceiver leftHandPeople = PeopleReceiverClient.getBallReceiver("LEFT_HAND");
        // 创建命令并与接收者关联
        PassBallCommand passBallCommand = new PassBallCommand(leftHandPeople);
        // 创建调用者与命令关联
        BallInvoker ballInvoker = new BallInvoker(passBallCommand);
        // 对调用者对象执行命令
        ballInvoker.execute();


        // 创建左手传球的接收者对象
        BallReceiver rightHandPeople = PeopleReceiverClient.getBallReceiver("RIGHT_HAND");
        // 创建命令并与接收者关联
        PassBallCommand passBallCommand1 = new PassBallCommand(rightHandPeople);
        // 创建调用者与命令关联
        BallInvoker ballInvoker1 = new BallInvoker(passBallCommand1);
        // 对调用者对象执行命令
        ballInvoker1.execute();

    }
}
