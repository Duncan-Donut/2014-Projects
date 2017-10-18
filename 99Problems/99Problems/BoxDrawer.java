import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BoxDrawer extends JPanel {
	
	int type;
	Color shade;
	
	public void setBoxType(int boxType){
		type = boxType;
		
	}
	
	public void setBoxColor(Color color){
		shade = color;
	}
	
	public void drawBox(Graphics g){
		
		switch(type){
		case 0: g.drawRect(100, 100, 50, 50);break;
		case 1: g.fillRect(100, 100, 50, 50);break;
		case 2: g.drawRoundRect(100, 100, 50, 50, 25, 25);break;
		case 3: g.fillRect(100, 100, 50, 50); g.drawRoundRect(100, 100, 50, 50, 25, 25);break;
		case 4: g.draw3DRect(100, 100, 50, 50, true);
		case 5: g.draw3DRect(100, 100, 50, 50, true); g.fillRect(100, 100, 50, 50);break;
		default: System.out.println("ERROR");
		}
		
		
		
	}
	
	public void paintComponent(Graphics g){
		repaint();
		
		if(shade == Color.WHITE){
			setBackground(Color.black);
			g.setColor(Color.white);
		}
		else{
			g.setColor(shade);
		}
		
		drawBox(g);
		
		
	}
	
	
	

}
