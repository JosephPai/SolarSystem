package com.game.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * 游戏开发工具类
 * @author Administrator
 *
 */
public class GameUtil {
	
	private GameUtil(){}	//工具类构造方法私有化
	
	public static Image getImage(String path){
		URL u = GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		try {
			img = ImageIO.read(u);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return img;
	}
}
