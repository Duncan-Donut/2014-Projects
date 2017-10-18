import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class Hotel {
	public static JFrame frame;
	public static JPanel pan;
	public static JPanel endPanel;
	public static JPanel buttonPanel;
	public static JPanel outPanel;
	public static GridBagConstraints c;
	public static GridBagConstraints f;
	public static JButton econ;
	public static Boolean openA = true;
	public static Boolean openB = true;
	public static ArrayList<String> Guest = new ArrayList<String>();
	
	public Hotel(){
		
		Frame();
		GUI();
		
	}
	
	public void Frame(){
		frame = new JFrame ("Kiosk");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600,400);
		
	}
	
	public void GUI (){
		
		buttonPanel = new JPanel(new GridBagLayout());
		GridBagConstraints GB = new GridBagConstraints();
		
		JButton b1 = new JButton("Check in?");
		GB.gridx=0;
		GB.gridy=0;
		GB.insets = new Insets(10,10,10,10);
		buttonPanel.add(b1, GB);
		
		JButton b2 = new JButton("Check out?");
		GB.gridx=1;
		GB.gridy=0;
		GB.insets = new Insets(10,10,10,10);
		buttonPanel.add(b2, GB);
		
		frame.add(buttonPanel);
	
		b1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e)
	            {
	            	buttonPanel.setVisible(false);
	            	Checkin();
	            }
	        });      
		
	
		b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	buttonPanel.setVisible(false);
            	Checkout();
            }
        });      
		
		
	}
	
	public void Checkin(){

		pan =  new JPanel(new GridBagLayout());
		c = new GridBagConstraints(); 
	
		JLabel name = new JLabel("What is your name?");
		c.gridx=0;
		c.gridy=0;
		pan.add(name,c);
		
		JLabel number = new JLabel("How many people in your party?");
		c.gridx=0;
		c.gridy=3;
		pan.add(number,c);
		
		JTextField namefield = new JTextField(20);
		c.insets = new Insets(10,10,10,10);
		c.gridx=1;
		c.gridy=0;
		pan.add(namefield,c);
		
		JTextField numberfield = new JTextField(2);
		c.insets = new Insets(10,10,10,10);
		c.gridx=1;
		c.gridy=3;
		pan.add(numberfield,c);
		
		JButton confirm = new JButton("Confirm");
		c.insets = new Insets(10,10,10,10);
		c.gridx=1;
		c.gridy=4;
		pan.add(confirm,c);
		
		//this was the freaking problem
		frame.add(pan);
		//this stupid little line
		
		
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Guest.add("");
				if((namefield.getText().equals("")) || (numberfield.getText().equals(""))){
					
					JPanel errorPanel = new JPanel(new GridBagLayout());
					
					GridBagConstraints d = new GridBagConstraints();
					
					errorPanel.setVisible(false);
					
					
					JButton econ = new JButton("Confirm");
					d.insets = new Insets(10,10,10,10);
					d.gridx=1;
					d.gridy=4;
					errorPanel.add(econ,d);
					
					JLabel error = new JLabel("Sorry you must fill in all the fields");
					d.insets = new Insets(10,10,10,10);
					d.gridx=1;
					d.gridy=0;
					
					errorPanel.add(error,d);
					pan.setVisible(false);
					errorPanel.setVisible(true);
					frame.add(errorPanel);
					
					econ.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							errorPanel.setVisible(false);
							pan.setVisible(true);
						}
					});
					
				}
				else{
					endPanel = new JPanel(new GridBagLayout());
					f = new GridBagConstraints();
					pan.setVisible(false);
					frame.add(endPanel);
					
					String hey = namefield.getText();
					
					int people =0;
	            	try {
	            	    people = Integer.parseInt(numberfield.getText());
	            	}
	            	catch(NumberFormatException ex)
	            	{
	            	    System.out.println("Exception : "+ex);
	            	}
	            	Rooms(people,hey);
	            	Memory(hey); 
	            	
				} 	
			}
		});
		
	}
	
	public void Checkout(){
		outPanel = new JPanel(new GridBagLayout());
		GridBagConstraints Con = new GridBagConstraints();
		
		
		frame.add(outPanel);
		
	}
	
	public void Memory(String h){

			int x=0;
			while(!(Guest.get(x).equals(h)) && x<Guest.size()-1){
				x++;
			}
			if(x!=Guest.size()-1){
				JPanel dupPanel = new JPanel(new GridBagLayout());
				GridBagConstraints la = new GridBagConstraints();
				
				JLabel duplicate = new JLabel("Duplicate Name - Please refer to the manager " + h);
				la.gridx=0;
				la.gridy=0;
				la.insets = new Insets(10,10,10,10);
				dupPanel.add(duplicate,la);
				
				JButton lazy = new JButton("Please press to restart");
				la.gridx=0;
				la.gridy=3;
				la.insets = new Insets(10,10,10,10);
				dupPanel.add(lazy,la);
				
				frame.add(dupPanel);
				
				
				pan.setVisible(false);
				dupPanel.setVisible(true);
				
				lazy.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						dupPanel.setVisible(false);
						buttonPanel.setVisible(true);
					}
				});
				
			}
			else{
				Guest.set(x,h);
			}
			
		
		
		for(int y=0; y<Guest.size();y++){
			System.out.println(Guest.get(y));
		}
	}
	
	public void Rooms(Integer n, String h){
		
		JLabel roomLab = new JLabel("Sorry there are no rooms with that occupany available");
		f.insets = new Insets(10,10,10,10);
		f.gridx = 0;
		f.gridy=0;
		endPanel.add(roomLab,f);
		
		JButton restart = new JButton("Please hit to finish process");
		f.insets = new Insets(10,10,10,10);
		f.gridx = 0;
		f.gridy=4;
		endPanel.add(restart,f);
		
		int x=0;
		
		if(openA == true && n<2){
			openA = false;
			x=1;
		}
		else if(openB == true && n<2){
			openB = false;
			x=2;
		}
	
		switch(x){
			case 1 : roomLab.setText("You have been assigned room A " + h); break;
			case 2 : roomLab.setText("You have been assigned room B " + h); break;
		}
		
		restart.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	           endPanel.setVisible(false);
	           buttonPanel.setVisible(true);
	           
	        }
	    });
		
		
	}
	
	public static void main(String[] args) {
		
		new Hotel();

	}

}
