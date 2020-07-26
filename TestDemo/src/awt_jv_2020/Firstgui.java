package awt_jv_2020;
import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Firstgui
{
   public static void main(String[] args)
   {
	   Frame f = new Frame();
	   f.setVisible(true);
	   f.setSize(400,400);
	   f.setLocation(20,200);
	   f.setBackground(Color.MAGENTA);
	   f.addWindowListener(new WindowAdapter()
			   {
		           public void windowClosing(WindowEvent e)
		           {
		        	   System.exit(0);
		           }
			   }
			   
			   
			   );
   }
}
