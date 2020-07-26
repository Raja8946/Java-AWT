import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Fifthgui extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Fifthgui() 
	{
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
		    g.fillRect(10, 100, 150, 100);
		    g.fill3DRect(200, 100, 150, 100, true);
		    g.fill3DRect(400, 100, 150, 100, false);
		    g.setColor(Color.green);
		    g.fillRect(10, 300, 150, 100);
		    g.fill3DRect(200, 300, 150, 100, true);
		    g.fill3DRect(400, 300, 150, 100, false);
		    
		    
	     }
	  
	     
    public static void main(String[] args)
    {
    	Fifthgui secFifthgui=new Fifthgui();

     }
}