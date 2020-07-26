package awt_jv_2020;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Demo6 extends Frame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public Demo6() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		b1= new Button("");
		b1.setSize(70,50);
		b1.setLocation(0,30);
		add(b1);
		
		b2= new Button("");
		b2.setSize(70,50);
		b2.setLocation(70,30);
		add(b2);
		
		b3= new Button();
		b3.setSize(70,50);
		b3.setLocation(138,30);
		add(b3);
		
		b4= new Button();
		b4.setSize(70,50);
		b4.setLocation(0,80);
		add(b4);
		
		b5= new Button();
		b5.setSize(70,50);
		b5.setLocation(70,80);
		add(b5);
		
		b6= new Button();
		b6.setSize(70,50);
		b6.setLocation(138,80);
		add(b6);
		
		b7= new Button();
		b7.setSize(70,50);
		b7.setLocation(0,130);
		add(b7);
		
		b8= new Button();
		b8.setSize(70,50);
		b8.setLocation(70,130);
		add(b8);
		
		b9= new Button();
		b9.setSize(70,50);
		b9.setLocation(138,130);
		add(b9);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		
	}
      int c=0;
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		// TODO Auto-generated method stub
		
		Button b= (Button)e.getSource();
		if(c%2 == 0)
		{
			b.setLabel("x");
		}
		else 
			{
				b.setLabel("O");
			}
			c++;
		}
		
	}
	


public class Tictactoe1 {
	    public static void main(String[] args)
	    {
	    	Demo6 d6=new Demo6();
	    	
	    	  d6.setVisible(true);
	  		d6.setSize(210,180);
	  		d6.setLocation(100,200); 
	  		d6.setBackground(Color.green);
	  		//d6.setForeground(Color.black);
	  	Font font=new Font("Forte",Font.BOLD,40);
	    	 d6.setFont(font);
	  		d6.addWindowListener(new WindowAdapter() 
	  	 	 {
	  	 		 public void windowClosing(WindowEvent e)
	  	 		 {
	  	 			 System.exit(0);
	  	 		 }
	  			});
	    }

}
