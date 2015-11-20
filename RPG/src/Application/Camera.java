package Application;

import java.awt.event.KeyEvent;

public class Camera {

	
	double camX = 0, camY = 0, x, y;
	
	public Camera(float x, float y){
		this.camX = camX;
		this.camY = camY;

	}
	public double getCamX(){
		return camX;
	}
	public double getCamY(){
		return camY;
	}
	
	public void setCamX(){
		this.camX = camX;
	}
	
	public void setCamY(){
		this.camY = camY;
	}
	
public void right(){
	 camX = 5;
}
public void left(){
	 camX = -5;

}
public void up(){
	 camY = 5;

}
public void down(){
	 camY = -5;

}
public void righto(){
	 camX = 0;
}
public void lefto(){
	 camX = 0;

}
public void upo(){
	 camY = 0;

}
public void downo(){
	 camY = 0;

}
public void tick() {
	  x+=camX;

	  y+=camY;	
}
	}
	

