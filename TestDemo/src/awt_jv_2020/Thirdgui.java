package awt_jv_2020;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 class Thirdgui extends Frame 
{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Thirdgui() {
		// TODO Auto-generated constructor stub
	
     
    	 setVisible(true);
    	 setSize(400,400);
    	 setLocation(20,200);
    	 setBackground(Color.BLACK);
    	 setForeground(Color.BLUE);
    	 Font font=new Font("Forte",Font.BOLD,40);
    	 setFont(font);
    	 addWindowListener(new WindowAdapter() 
    	 {
    		 public void windowClosing(WindowEvent e)
    		 {
    			 System.exit(0);
    		 }
		});
    	 
     }
     
     public void paint(Graphics g)
     {
    	 g.drawString("Hello", 120, 200);
    	 g.drawLine(100, 171, 250, 171);
    	 g.drawLine(100, 200, 250, 200);
     }
     
     
     public static void main(String[] args)
     {
    	Thirdgui sec = new Thirdgui(); 
     }
}
