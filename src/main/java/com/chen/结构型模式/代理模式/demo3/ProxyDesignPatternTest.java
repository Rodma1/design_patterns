package com.chen.结构型模式.代理模式.demo3;

/**
 * @author chenyunzhi
 * @date 2024/5/31 14:41
 * @Description  客户端
 */
public class ProxyDesignPatternTest {
    public static void main(String[] args) {

        System.out.println("-----------普通用户执行命令-----------");
        CommandExecutorProxy commandExecutorProxy = new CommandExecutorProxy();

        commandExecutorProxy.exec("ls");

        commandExecutorProxy.exec("rm");

        System.out.println("-------------管理员执行命令-----------");

        commandExecutorProxy = new CommandExecutorProxy("admin", "123456");

        commandExecutorProxy.exec("ls");

        commandExecutorProxy.exec("rm -rf text.py");

    }

}

