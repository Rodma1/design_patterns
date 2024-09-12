package com.chen.行为型模式.命令设计模式;

/**
 * @Author chenyunzhi
 * @DATE 2024/9/12 16:27
 * @Description: 命令的调度者，执行命令
 */
public class BallInvoker {
    public Command command;

    public BallInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
