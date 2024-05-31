package com.chen.创建者模式.demo3.demo3_3;

import java.util.List;


/**
 * @author chenyunzhi
 */
public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Ball ball = new Ball();
		ball.loadData();
		Ball ballNew =ball.clone();
		Ball ballNew1 = ball.clone();
		List<String> list = ballNew.getBallList();
		list.add("tennis");
		List<String> list1 = ballNew1.getBallList();
		list1.remove("basketball");
		// 输入修改后的球类列表
		System.out.println("ball List: "+ball.getBallList());
		System.out.println("ballNew List: "+list);
		System.out.println("ballNew1 List: "+list1);
		System.out.println("ball List: "+ball.getBallList());
	}

}