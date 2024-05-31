package com.chen.创建者模式.demo3.demo3_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyunzhi
 */
public class Ball implements Cloneable{

	private final List<String> ballList;
	
	public Ball(){
		ballList = new ArrayList<>();
	}
	
	public Ball(List<String> ballList){
		this.ballList=ballList;
	}

	/**
	 * 模拟从数据库中拿数据
	 */
	public void loadData(){
		ballList.add("basketball");
		ballList.add("soccer");
	}
	
	public List<String> getBallList() {
		return ballList;
	}

	@Override
	public Ball clone() throws CloneNotSupportedException {
			return new Ball(new ArrayList<>(this.getBallList()));
	}

	
}