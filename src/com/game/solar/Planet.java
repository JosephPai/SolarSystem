package com.game.solar;

import java.awt.Color;
import java.awt.Graphics;

import com.game.util.GameUtil;

public class Planet extends Star{
	
	//����ͼƬ�����ꡣ��������ĳ����Բ���У����ᡢ���ᡢ�ٶȡ��Ƕȡ�
	//����ĳ��star��
	double longAxis;	//��Բ����
	double shortAxis;	//��Բ����
	double speed;		//�����ٶ�
	double degree;
	Star center;
	
	boolean satelite;
	
	public void draw(Graphics g){
		super.draw(g);		
		move();
		if(!satelite){
			drawTrace(g);
		}
	}
	
	public void drawTrace(Graphics g){
		double ovalX, ovalY, ovalWidth, ovalHeight;
		
		ovalWidth = longAxis*2;
		ovalHeight = shortAxis*2;
		ovalX = center.x + center.width/2 - longAxis;
		ovalY = center.y + center.height/2 - shortAxis;
		
		
		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)ovalX, (int)ovalY, (int)ovalWidth, (int)ovalHeight);
		g.setColor(c);
	}
	
	public void move(){
		//������Բ�켣����
		x = center.x + center.width/2 + longAxis*Math.cos(degree);
		y = center.y + center.height/2 + shortAxis*Math.sin(degree);
				
		degree += speed;
	}
	

	public Planet(Star center, String imgPaht, double longAxis, 
			double shortAxis, double speed) {
		super(GameUtil.getImage(imgPaht));
		this.center = center;
		this.x = center.x + longAxis;
		this.y = center.y;
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		
	}
	
	public Planet(Star center, String imgPaht, double longAxis, 
			double shortAxis, double speed, boolean satelite){
		this(center, imgPaht, longAxis, shortAxis, speed);
		this.satelite = satelite;
	}



	public Planet(String imgPaht, double x, double y) {
		
		super(imgPaht, x, y);
	}
	
}
