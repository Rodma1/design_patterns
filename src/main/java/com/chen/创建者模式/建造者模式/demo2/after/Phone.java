package com.chen.创建者模式.建造者模式.demo2.after;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/11 22:37
 * @Description:
 */
public class Phone {
    private String cpu;
    private  String mainboard;

    // Phone有参构造函数
    private Phone(Builder builder) {
        cpu = builder.cpu;
        mainboard = builder.mainboard;
    }

    // 构建抽象者类
    public static class Builder {
        private String cpu;

        private String mainboard;

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }
        public Phone build() {
            return new Phone(this);
        }
    }



    @Override
    public String toString() {
        return "Phone{" +cpu +","+ mainboard+"}";
    }
}
