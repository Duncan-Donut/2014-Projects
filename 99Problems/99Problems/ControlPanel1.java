/**
 * Represents the control panel for the Ramblecs game
 */

import java.awt.GridLayout;
import java.awt.Dimension;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ControlPanel1 extends JPanel
      implements ScoreDisplay
{
  private LetterPanel whiteboard;
  private JSlider speedSlider;
  private JTextField clockField, scoreField, speedField;
  private JButton go;
  private final int minSpeed = 5, initSpeed = 50, maxSpeed = 195;
  long startTime;

  ControlPanel(LetterPanel lpanel)
  {
    whiteboard = lpanel;

    // setup GUI:
    JFrame window = new JFrame("ActionListener demo");
    window.setBounds(100, 100, 300, 100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true); 
    window.add(whiteboard);
    
    
  }

  // Starts a new game.
  public void newGame()
  {
    go.setText("Go");

    clockField.setText("00:00");
    startTime = System.currentTimeMillis();
    Timer clock = new Timer(1000, new ClockListener());
    clock.start();

    int speed = speedSlider.getValue();
    speedField.setText(String.format("%3d", speed));
    whiteboard.setSpeed(speed);

    whiteboard.newGame();
    requestFocus();
  }

  // Called from RamblecsKeyListener.
  public void slowDown()
  {
    int x = speedSlider.getValue();
    speedSlider.setValue(x-10);
  }

  // Called from RamblecsKeyListener.
  public void speedUp()
  {
	  int x = speedSlider.getValue();
	    speedSlider.setValue(x+10);
  }

  // Called from LetterPanel.
  public void update(int score)
  {
    scoreField.setText(String.format("%03d", score));
  }

  // Handles clock events.
  private class ClockListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      int secs = (int) ((System.currentTimeMillis() - startTime) / 1000);
      int mins = secs / 60;
      secs %= 60;
      mins %= 60;
      clockField.setText(String.format("%02d:%02d", mins, secs));
    }
  }

  // Handles speed slider events.
  private class SliderListener implements ChangeListener
  {
    public void stateChanged(ChangeEvent e)
    {
      int speed = speedSlider.getValue();
      speedField.setText(String.format("%3d", speed));
      whiteboard.setSpeed(speed);
      requestFocus();
    }
  }

  // Handles speed field events.
  private class SpeedFieldListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
     
    	try{
    	int x = Integer.parseInt(speedField.getText());
    	speedSlider.setValue(x);
    	}
    	catch(Exception ee){
    		
    	}
    
    	
    	
      requestFocus();
    }
  }

  // Handles Go button events.
  private class GoButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      String cmd = e.getActionCommand();
      if ("Go".equals(cmd))
      {
        whiteboard.dropCube();
        go.setText("Stop");
      }
      else
      {
        whiteboard.stopCube();
        go.setText("Go");
      }
      requestFocus();
    }
  }
}

