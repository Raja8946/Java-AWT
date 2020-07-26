package awt_jv_2020;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sixthgui extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Sixthgui() {
		// TODO Auto-generated constructor stub

   	 setVisible(true);
   	 setSize(400,400);
   	 setLocation(200,200);
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
	     int y=100;
	     for(int i=1;i<=10;i++)
	     {
	    	 g.drawString(""+i, 100, y);
	    	 try 
	    	 {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
	    	 y=y+50;
	     }
	}
	
	public static void main(String[] args)
	{
		Sixthgui sixthgui=new Sixthgui();
	}

}
