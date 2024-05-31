package com.chen.结构型模式.代理模式.demo3;

/**
 * @author chenyunzhi
 * @date 2024/5/31 14:28
 * @Description
 */
public class CommandExecutorProxy implements CommandExecutor{

    private boolean admin;
    private final CommandExecutor commandExecutor;

    public CommandExecutorProxy() {
        commandExecutor = new CommandExecutorImpl();
    }

    public CommandExecutorProxy(String user, String password) {
        // 需要输入正确账号密码才能获得管理员权限
        if ("admin".equals(user)  && "123456".equals(password)) {
            admin = true;
        }
        commandExecutor = new CommandExecutorImpl();
    }
    @Override
    public void exec(String cmd) {
        if (!admin) {
            if (cmd.startsWith("rm")) {
                System.out.println(cmd + "没有权限执行");
                return;
            }
        }
        commandExecutor.exec(cmd);
    }
}
