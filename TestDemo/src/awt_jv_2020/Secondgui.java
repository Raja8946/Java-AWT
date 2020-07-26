import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 class Secondgui extends Frame 
{
     Secondgui()
     {
    	 setVisible(true);
    	 setSize(400,400);
    	 setLocation(20,200);
    	 setBackground(Color.YELLOW);
    	 addWindowListener(new WindowAdapter() 
    	 {
    		 public void windowClosing(WindowEvent e)
    		 {
    			 System.exit(0);
    		 }
		});
    	 
     }
     
     
     
     public static void main(String[] args)
     {
    	Secondgui sec = new Secondgui(); 
     }
}
