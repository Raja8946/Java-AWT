package awt_jv_2020;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tengui  extends Frame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Tengui() {
		// TODO Auto-generated constructor stub
    	 setVisible(true);
	   	 setSize(500,500);
	   	 setLocation(20,200);
	    setBackground(Color.white);
	   	// setForeground(Color.BLUE);
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
	    try 
	    {
	    	g.setColor(Color.black);
	    	Thread.sleep(300);
	    	g.fillRect(100, 100, 5, 300);
	    	Thread.sleep(300);
	    	g.fillRect(85, 400, 40, 10);
	    	Thread.sleep(300);
	    	g.fillRect(75, 410, 60, 20);
	    	Thread.sleep(300);
	    	g.fillRect(65, 420, 80, 30);
	    	Thread.sleep(300);
	    	g.setColor(Color.orange);
	    	g.fillRect(105, 100, 120, 35);
	    	Thread.sleep(300);
	    	int a,b,c,d,e,f;
      		 a=130;
      		b=135;
      		c=60;
      		d=30;
      		e=0;
      		f=6;
      		for(int i=0;i<=24;i++)
      		{
      			int r1=(int)(Math.round(Math.random()*255));
      			int g1=(int)(Math.round(Math.random()*255));
      			int b1= (int)(Math.round(Math.random()*255));
      			Color color= new Color(r1,g1,b1);
      			g.setColor(color);
      			g.fillArc(a, b, c, d, e, f);
      			e=e+15;
      			Thread.sleep(300);
      		}
      		
	    	g.setColor(Color.green);
	    	g.fillRect(105, 170, 120, 35);
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
    public static void main(String[] args)
    {
    	Tengui tengui = new Tengui();
    }
}
