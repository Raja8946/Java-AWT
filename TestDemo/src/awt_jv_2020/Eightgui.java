package awt_jv_2020;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Eightgui extends Frame implements ActionListener {
	public Eightgui() {
		// TODO Auto-generated constructor stub
		 setVisible(true);
	   	 setSize(600,600);
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
		int a,b,c,d,e,f;
		 a=100;
		b=100;
		c=150;
		d=100;
		e=0;
		f=30;
		for(int i=0;i<=12;i++)
		{
			g.fillArc(a, b, c, d, e, f);
			e=e+30;
			try {
				Thread.sleep(200);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Eightgui eightJava = new Eightgui();
	}

}
}
