import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
		
	 private Image picture;
	
	 public ImagePanel(String name)
	 {
	 setSize(1000, 800);
	 
	 try
	 {
		 picture = ImageIO.read(new File(name)); 
	 }
	 catch (IOException ex)
	 {
	 System.out.println("*** Can't load " + name + " ***");
	 System.exit(1);
	 }
	 }

	 public void paint(Graphics g)
	 {
	 super.paint(g);

	 if (picture != null)
	 {
	 // center the picture:
	 int x = (getWidth() - picture.getWidth(null)) / 2;
	 int y = (getHeight() - picture.getHeight(null)) / 2;
	 g.drawImage(picture, x, y, null);
	 }
	 }

	 public static void main(String[] args)
	 {
		 ImagePanel window = new ImagePanel("coin.gif");
		 window.setLocation(20, 20);
		 window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 window.setVisible(true); 
	
	

}
