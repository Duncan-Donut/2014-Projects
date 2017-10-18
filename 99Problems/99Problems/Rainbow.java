// Chapter 5 Question 27

// Duncan

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{

  private final Color skyColor = Color.CYAN;
	
  public Rainbow()
  {
    setBackground(skyColor);
  }


  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth(); //gives you random numbers like 282 and for height it gives you 153   
    int height = getHeight();


   int xCenter = width / 2;
   int yCenter = height * 3 / 4;

    
   int largRadius = width / 4;
  
   g.setColor(Color.RED);


    g.fillArc(xCenter,yCenter,largRadius,largRadius,0,180);

   
   int magRadius = height/4;
   int greenRadius = (int)Math.round(Math.sqrt(magRadius * largRadius));
 
   //i had to adjust each and every xcenter and y center as the xcenter and ycenter kept shifting... for some unknown reason
   g.setColor(Color.GREEN);
   g.fillArc(xCenter+9,yCenter+9,greenRadius,greenRadius,0,180);
 
   g.setColor(Color.MAGENTA);
   g.fillArc(xCenter+16,yCenter+15,magRadius,magRadius,0,180);
    
    int skyRadius = (largRadius - (greenRadius - magRadius))/2; //instructions unclear of what skyRadius should be... what does it means?
    //it says choose the radius of the sky-color in w ay that the width of the middle(green) ring is the arithmetic mean of the widths of the red
    // and magenta rings... what does that mean? for this i did what I could but i didn't understand that problem.
    

    g.setColor(Color.CYAN);
    g.fillArc(xCenter+21,yCenter+20,skyRadius,skyRadius,0,180);
  
    //overall a very confusing problem
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
