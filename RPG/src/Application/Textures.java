package Application;

import java.awt.image.BufferedImage;

public class Textures {

	public BufferedImage player;
	private SpriteSheet ss;
	public Textures(Game game){
		ss = new SpriteSheet(game.getSpriteSheet());
		
		getTextures();
	}
	private void getTextures(){
		player = ss.grabImage(1,  1,  32,  32);
	}
}
