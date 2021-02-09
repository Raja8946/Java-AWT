package awt_jv_2020;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Elevengui extends Frame 
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



public Elevengui() {
	// TODO Auto-generated constructor stub}
	  setVisible(true);
 	 setSize(700,700);
 	 setLocation(20,200);
 	 setBackground(Color.BLACK);
 	 setForeground(Color.BLUE);
 	 Font font=new Font("Forte",Font.BOLD,25);
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
	int x=100;
	int y=100;
	for(int i=1;i<=10;i++)
	{
	  for (int j = 1; j <=10; j++) 
	  {
		g.drawString(""+(i*j), x, y);
		x=x+50;
		
	  
		try {
			Thread.sleep(300);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	  
	  }
	  x=100;
	  y=y+50;
	}
}

  
  
  public static void main(String[] args)
  {
	  Elevengui elevengui= new Elevengui();
  }
}
