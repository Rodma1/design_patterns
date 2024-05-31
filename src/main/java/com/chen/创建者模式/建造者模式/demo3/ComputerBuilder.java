package com.chen.创建者模式.建造者模式.demo3;

/**
 * 电脑对象
 *
 * @author chenyunzhi
 * @date 2024/2/25 21:49
 */
public class ComputerBuilder extends Computer{

    private final String memory;

    private final String disk;

    private final Boolean isSpeaker;

    /**
     * 私有构造函数 以 Builder 类作为参数
     */
    private ComputerBuilder(Builder builder) {
        this.memory = builder.memory;
        this.disk = builder.disk;
        this.isSpeaker = builder.isSpeaker;
    }

    @Override
    public String memory() {
        return this.memory;
    }

    @Override
    public String disk() {
        return this.disk;
    }

    @Override
    public Boolean isSpeaker() {
        return this.isSpeaker;
    }

    public static class Builder {
        private final String memory;

        private final String disk;

        private Boolean isSpeaker;


        public Builder(String memory, String disk) {
            this.memory = memory;

            this.disk = disk;
        }


        public Builder setIsSpeaker(Boolean isSpeaker) {
            this.isSpeaker = isSpeaker;
            return this;
        }

        /**
         * 返回客户端程序所需的对象
         */
        public Computer build() {
            return new ComputerBuilder(this);
        }



    }
}
