package com.game.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.game.util.Constant;
import com.game.util.GameUtil;
import com.game.util.MyFrame;

/**
 * Ì«ÑôÏµÖ÷´°¿Ú
 * @author Administrator
 *
 */
public class SolarFrame extends MyFrame{
	Image bg = GameUtil.getImage("images/back.jpg");
	Star sun = new Star("images/sun30.png",Constant.GAME_WIDTH/2-90,Constant.GAME_HEIGHT/2-90);
	
	Planet shui = new Planet(sun, "images/shui.png",70,50,0.005);
	Planet jin = new Planet(sun, "images/jin.png", 100,80,0.007);
	Planet earth = new Planet(sun, "images/di.png", 150, 100, 0.01);
	Planet mars = new Planet(sun, "images/huo.png",200,130,0.02);
	Planet mu = new Planet(sun, "images/mu.png", 260, 160, 0.03);
	Planet tu = new Planet(sun, "images/tu.png",300,190,0.04);
	Planet tian = new Planet(sun,"images/tian.png",330, 220, 0.06);
	Planet hai = new Planet(sun, "images/hai.png", 360,250,0.07);
	Planet moon = new Planet(earth, "images/yue.png",30,20,0.03,true);
	
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		shui.draw(g);
		jin.draw(g);
		earth.draw(g);
		mars.draw(g);
		mu.draw(g);
		tu.draw(g);
		tian.draw(g);
		hai.draw(g);
		
		moon.draw(g);
	}
	
	public static void main(String[] args){
		new SolarFrame().launchFrame();
	}
}
