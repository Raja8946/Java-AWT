import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 class Fourgui extends Frame 
{
     public Fourgui() {
		// TODO Auto-generated constructor stub
	
     
    	 setVisible(true);
    	 setSize(400,400);
    	 setLocation(20,200);
    	 setBackground(Color.BLACK);
    	 setForeground(Color.BLUE);
    	 //Font font=new Font("Forte",Font.BOLD,40);
    	 //setFont(font);
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
    	//g.drawRect(50, 100, 300, 200);
    	//g.drawRoundRect(50, 100, 300, 200, 40, 50);
    	// g.drawOval(50, 100, 100, 100);
    	// g.drawOval(50, 100, 300, 100);
    	// g.drawArc(50, 100, 150, 100, 0, 360);
    	// g.drawArc(50, 100, 150, 100, 90, 270);
    	// int x[]= {200,300,250,150,100};
    	// int y[]= {100,200,400,400,250};
    	 //int n=5;
    	 //g.drawPolygon(x,y,n);
    	 try {
    		 
		       Thread.sleep(1000);	
		}
  	 catch (Exception e) {
			// TODO: handle exception
		}
    	 g.fillRect(100, 100, 200, 200);
    	 
    	 try {
    		 
		       Thread.sleep(1000);	
		}
    	 catch (Exception e) {
			// TODO: handle exception
		}
    	 g.setColor(Color.RED);
    	 g.fillRect(120, 120, 160, 160);
    	 try {
    		 
		       Thread.sleep(1000);	
		}
  	 catch (Exception e) {
			// TODO: handle exception
		}
    	 g.setColor(Color.green);
    	 g.fillRect(140, 140, 120, 120);
    	 try {
    		 
		       Thread.sleep(1000);	
		}
  	 catch (Exception e) {
			// TODO: handle exception
		}
    	 g.setColor(Color.yellow);
    	 g.fillRect(160, 160, 80, 80);
    	 try {
    		 
		       Thread.sleep(1000);	
		}
  	 catch (Exception e) {
			// TODO: handle exception
		}
    	 g.setColor(Color.MAGENTA);
    	 g.fillRect(180, 180, 40, 40);
     }

     
     
     public static void main(String[] args)
     {
    	Fourgui sec = new Fourgui(); 
     }
}
