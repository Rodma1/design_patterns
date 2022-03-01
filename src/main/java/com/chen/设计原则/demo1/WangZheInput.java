package com.chen.设计原则.demo1;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/1 9:48
 * @Description: 王者皮荣耀
 */
public class WangZheInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin){
        this.skin=skin;
    }

    public void display(){
        skin.display();
    }

}
