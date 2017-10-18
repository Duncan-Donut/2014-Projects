/**
 * A menu bar for the Ramblecs game
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;

public class RamblecsMenu extends JMenuBar
    implements ActionListener
{
  // Fields:
 

  // Constructor:
  public RamblecsMenu(Ramblecs game)
  {
    
   
  }
  public boolean soundEnabled()
  {
	  
	return false;
    
  }

  public void actionPerformed(ActionEvent e)
  {
    JMenuItem src = (JMenuItem)e.getSource();
   
    
  }
}


