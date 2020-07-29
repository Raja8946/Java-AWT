package awt_jv_2020;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Demo8 extends Frame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button[] b=new Button[9];
	
	  int x=0;
	    int y=100;
	    int w=100;
	    int h=100;
	    int k=0;
	public Demo8() {
		setLayout(null);
		setTitle("TicTacToe");
		// TODO Auto-generated constructor stub
		Font font=new Font("Forte",Font.BOLD,40);
	 	 setFont(font);
	
	
	  
	    
	    for (int i = 0; i <3; i++) 
	    {
		     for (int j = 0; j < 3; j++) 
		     {
			     b[k]= new Button();
			     b[k].setSize(w,h);
			     b[k].setLocation(x,y);
			     
			     add(b[k]);
			     
			      b[k].addActionListener(this);
			      k++;
			     x=x+100;
			}
		     x=0;
		     y=y+100;
		     
		     setResizable(false);
		}
	    
	}

         int c=0;
	public void actionPerformed(ActionEvent e) 
	{
	      Button b1=(Button)e.getSource();
			if(c%2 == 0)
			{
				b1.setLabel("X");
			}
			else 
				{
					b1.setLabel("O");
				}
			  b1.removeActionListener(this);
				c++;
	
				if(
						b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X"
			           || b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X"
			           || b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X"
					   || b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X"
				       || b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X"
				       || b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X"
	                   || b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X"
				       || b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X")
				 {
				     System.out.println("Player 1 is winner");
				}
				else if (b[0].getLabel()=="0" && b[1].getLabel()=="O" && b[2].getLabel()=="O"
						   || b[3].getLabel()=="O" && b[4].getLabel()=="O" && b[5].getLabel()=="O"
				           || b[6].getLabel()=="0" && b[7].getLabel()=="O" && b[8].getLabel()=="O"
						   || b[0].getLabel()=="O" && b[3].getLabel()=="O" && b[6].getLabel()=="O"
					       || b[1].getLabel()=="O" && b[4].getLabel()=="O" && b[7].getLabel()=="O"
					       || b[2].getLabel()=="O" && b[5].getLabel()=="O" && b[8].getLabel()=="O"
		                   || b[0].getLabel()=="O" && b[4].getLabel()=="O" && b[8].getLabel()=="O"
					       || b[2].getLabel()=="O" && b[4].getLabel()=="O" && b[6].getLabel()=="O")
				{
				    System.out.println("Player 2 is winner");	
				}
				
				
	}
	
	
	

		// TODO Auto-generated method stub
		
	}


public class Tictactoe2 
{
     public static void main(String[] args)
     {
    	 Demo8 d8=new Demo8();
    	   	
    	  d8.setVisible(true);
   		d8.setSize(300,500);
   		d8.setLocation(100,200); 
   		d8.setBackground(Color.green);
   		//d6.setForeground(Color.black);
   	
   		d8.addWindowListener(new WindowAdapter() 
   	 	 {
   	 		 public void windowClosing(WindowEvent e)
   	 		 {
   	 			 System.exit(0);
   	 		 }
   			}); 
     }
}
