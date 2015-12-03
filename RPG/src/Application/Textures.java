package Application;

import java.awt.image.BufferedImage;

public class Textures {

	public BufferedImage player;
	public BufferedImage player2;

	private SpriteSheet ss;
	public Textures(Game game){
		ss = new SpriteSheet(game.getSpriteSheet());
		
		getTextures();
	}
	private void getTextures(){
		player = ss.grabImage(1,  1,  32,  32);
		player2 = ss.grabImage(1, 2, 32, 32);
	}
}
