package awt_jv_2020;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Demo7 extends Frame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a[]= {1,2,3,4,5,6,7,8,9};

	public Demo7() {
		// TODO Auto-generated constructor stub
		Font font=new Font("Forte",Font.BOLD,40);
	 	 setFont(font);
	}
	
        public void paint(Graphics g) 
        {
		  int x=100;
		  int y=100;
		  int k=0;
		  for (int i = 0; i< 3; i++) 
		  {
			for (int j = 0; j < 3; j++) 
			{
			  g.drawString(""+a[k], x, y);
			  k++;
			  x=x+40;
			}
			 x=100;
			 y=y+40;
		}
		}
}

public class Arraygui 
{
   public static void main(String[] args)
   {
	   Demo7 d7=new Demo7();
   	
 	  d7.setVisible(true);
		d7.setSize(300,220);
		d7.setLocation(100,200); 
		d7.setBackground(Color.green);
		//d6.setForeground(Color.black);
	
		d7.addWindowListener(new WindowAdapter() 
	 	 {
	 		 public void windowClosing(WindowEvent e)
	 		 {
	 			 System.exit(0);
	 		 }
			});
	   
   }
}
