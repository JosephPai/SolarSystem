package com.game.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ����������������Ƕȷ���
 * ���ʵ��һ��С��̨����Ϸ
 * @author Administrator
 *
 */
public class GameFrame3 extends MyFrame{	//GUI���:AWT swing�ȡ�
	
	Image img = GameUtil.getImage("images/bymax.jpg");
	
	
	
	private double x=100,y=100;
	private double degree=3.14/3;	//����0-2PI
	private double speed = 10;
	@Override
	public void paint(Graphics g) {		
		g.drawImage(img, (int)x, (int)y, null);
		
		if(speed>0){
			speed -= 0.5;
		}else{
			speed = 0;
		}
		x += speed*Math.cos(degree);
		y += speed*Math.sin(degree);
		
		if(y>500){
			degree = -degree;
		}
		if(y<30){
			degree = -degree;
		}
		if(x<0){
			degree = Math.PI-degree;
		}
		if(x>500){
			degree = Math.PI-degree;
		}
	}
	
	/**
	 * �ػ����ڵ��߳��࣬��һ���ڲ���
	 * @author Administrator
	 *
	 */


	public static void main(String[] args){
		GameFrame3 gf = new GameFrame3();
		gf.launchFrame();
	}
	
}
