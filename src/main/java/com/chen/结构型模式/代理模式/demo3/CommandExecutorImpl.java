package com.chen.结构型模式.代理模式.demo3;

/**
 * @author chenyunzhi
 * @date 2024/5/31 14:25
 * @Description
 */
public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void exec(String cmd) {
        System.out.println("执行了" + cmd);
    }
}
