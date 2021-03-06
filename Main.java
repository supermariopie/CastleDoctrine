import java.util.*;
import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;

class Main extends JApplet {
  public static Keychecker God = new Keychecker();
  public static Mousechecker Jesus = new Mousechecker();
  HashMap<Integer, Tile> derict = new HashMap<Integer, Tile>();

  final int NUM_IMAGES = 3;
  
  public static void main(String[] args) {
    /* HashMap Setup */
    Tile emptytile = new Tile() {
      public void doaction() {

      }
    };
    
    Tile goalTile = new Tile() {
      public void doaction() {
        System.out.println("You win!");
        System.exit(42);
      }
    };
    Tile wallTile = new Tile() {
      public void doaction() {
        this.moveinto = false;
      }
    };
    /* End HashMap Setup */
	/* Image file setup */
	/* The width is 128 px */
	ClassLoader cl = this.getClass().getClassLoader();
	ImageIcon bigimage = new ImageIcon(cl.getResource(filename)).getImage();
	
	w = bigimage.getWidth(null);
	h = bigimage.getHeight(null);
	
	/* Will continue here by splitting the big image */
	for (int i = 0; i < h && i * w + j < NUM_IMAGES; i+= 128) {
		for (int j = 0; j < w && i * w + j < NUM_IMAGES; j+= 128) {
			//derict.get(i * w + j).setImage() //continue here
			//use getSubImage
		}
	}
    System.out.println("Hello world!");
  }
  

public static class Keychecker extends KeyAdapter 
{
  public String choice = "";
  public void keyPressed(KeyEvent event) 
  {
   	int key = event.getKeyChar();
   	int help = event.getKeyCode();
  	if(help == KeyEvent.VK_UP || key == 'w')
      choice = "up";
    if(help == KeyEvent.VK_LEFT || key == 'a')
      choice = "left";
    if(help == KeyEvent.VK_DOWN || key == 's')
      choice = "down";
    if(help == KeyEvent.VK_RIGHT || key == 'd')
      choice = "right";
  }
}
public static class Mousechecker extends MouseAdapter
{
  public int xcord;
  public int ycord;
  public void mousePressed(MouseEvent event)
  {
    System.out.println("mouse clicked at point:" + event.getX() + " " + event.getY());
    xcord = event.getX();
    ycord = event.getY();
  }
}
}