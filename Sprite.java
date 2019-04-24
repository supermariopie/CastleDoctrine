/* the interface i will use for all upcoming sprites */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sprite {
	int x;
	int y;
	int w;
	int h;

	Image image;
	boolean visible;
	ClassLoader cl;
	
	public Sprite(String name) {
		cl = this.getClass().getClassLoader();
		
		image = (new ImageIcon(cl.getResource(name))).getImage();

		w = image.getWidth(null);
		h = image.getHeight(null);
	}
	public Sprite (int x, int y, String name) {
		cl = this.getClass().getClassLoader();
		
		this.x = x;
		this.y = y;
		visible = false;
		
		image = (new ImageIcon(cl.getResource(name))).getImage();
		/*ImageIcon ii = new ImageIcon(name);
		image = ii.getImage();*/
		w = image.getWidth(null);
		h = image.getHeight(null);
		
	}

	public void setX(int hi) {
		x=hi;
	}
	public void setY(int bye) {
		y=bye;
	}
	public void setPosition(int x, int y) {
		this.x=x;
		this.y=y;
	}
  
  /* ap stands for adjust position */
	public void ap(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(String filename) {
		cl = this.getClass().getClassLoader();
		image = new ImageIcon(cl.getResource(filename)).getImage();
		w = image.getWidth(null);
		h = image.getHeight(null);
	}
	public boolean isVisible() {
		return visible;
	}
	public boolean setVisible(boolean mode) {
		visible = mode;
		return visible;
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,w,h);
	}
	
}/* the interface i will use for all upcoming sprites */

