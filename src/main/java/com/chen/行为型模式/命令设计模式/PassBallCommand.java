package com.chen.行为型模式.命令设计模式;

/**
 * @Author chenyunzhi
 * @DATE 2024/9/12 15:23
 * @Description: 传球命令
 */
public class PassBallCommand implements Command{

    private final BallReceiver ballReceiver;

    public PassBallCommand(BallReceiver ballReceiver) {
        this.ballReceiver = ballReceiver;
    }

    @Override
    public void execute() {
        this.ballReceiver.passBall();
    }
}
