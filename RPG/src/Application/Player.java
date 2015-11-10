package Application;

import java.awt.*;
public class Player {
	
	private double x;
	private double y;
	
	private double velX = 0;
	private double velY = 0;
	
	public Player(double x, double y){
		this.x = x;
		this.y = y;
		
	}

	public void tick(){
		x+=velX;
		y+=velY;
		
		
	}
	
	public void render(Graphics g){
		g.drawRect(5, 5, 5, 5);
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void  setVelX(double X){
		this.velX = x;
}
	public void  setVelY(){
		this.velY = y;
	}
}
