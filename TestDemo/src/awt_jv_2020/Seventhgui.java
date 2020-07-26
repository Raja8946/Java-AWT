import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Seventhgui extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	public Seventhgui() {
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
	     int x1=100;
	     int y1=100;
	     int x2=101;
	     int y2=100;
	     for (int i = 1; i <= 100; i++) 
	     {
		       g.drawLine(x1, y1, x2, y2);
		      // x1=x1+1;
		       x2=x2+1;
		       try {
				       Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
	     }
		       g.setColor(Color.red);
		       for (int j = 1; j <= 100; j++) 
			     {
				       g.drawLine(x1, y1, x2, y2);
				       
				       y2=y2+1;
				       try {
						       Thread.sleep(10);
					} catch (Exception e) {
						// TODO: handle exception
					}
			     }
				       g.setColor(Color.green);
				       for (int i = 1; i <= 100; i++) 
					     {
						       g.drawLine(x1, y1, x2, y2);
						     //  x1=x1+1;
						       x2=x2-1;
						       try {
								       Thread.sleep(10);
							} catch (Exception e) {
								// TODO: handle exception
							}
		       //x1=x1+10;
		       //x2=x2-10;
		       //y1=y1+20;
		       //y2=y2+20;
		       
		}
	     }
	     
	     
	
	
	public static void main(String[] args)
	{
		Seventhgui seventhguigui=new Seventhgui();
	}

}
