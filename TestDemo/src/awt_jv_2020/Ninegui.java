import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ninegui extends Frame {
         public Ninegui() {
			// TODO Auto-generated constructor stub
        	 setVisible(true);
    	   	 setSize(600,600);
    	   	 setLocation(20,200);
    	   	 setBackground(Color.green);
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
        //	g.setColor(Color.WHITE);	
        	 int a,b,c,d,e,f;
       		 a=100;
       		b=100;
       		c=150;
       		d=100;
       		e=0;
       		f=15;
       		for(int i=0;i<=24;i++)
       		{
       			int r1=(int)(Math.round(Math.random()*255));
       			int g1=(int)(Math.round(Math.random()*255));
       			int b1= (int)(Math.round(Math.random()*255));
       			Color color= new Color(r1,g1,b1);
       			g.setColor(color);
       			g.fillArc(a, b, c, d, e, f);
       			e=e+15;
       			try {
       				Thread.sleep(400);
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
       		}
		}
         public static void main(String[] args)
         {
        	 Ninegui ninegui = new Ninegui();
         }
}
