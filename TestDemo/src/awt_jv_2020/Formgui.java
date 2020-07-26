import java.awt.*;
import java.awt.event.*;
class Demo1 extends Frame implements ActionListener
{
	Button b1,b2,b3;
	
    public Demo1() {
		// TODO Auto-generated constructor stub
    	FlowLayout flowLayout = new FlowLayout();
    	setLayout(flowLayout);
    	b1= new Button("Login");
    	add(b1);
    	b2= new Button("Login2");
    	add(b2);
    	b3= new Button("Login3");
    	add(b3);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	
	}	
    public void actionPerformed(ActionEvent e)
    {
    	//System.out.println("Hello");
    	if(e.getSource()==b1)
    	{
    	setBackground(Color.red);
    	}
    	if(e.getSource()==b2)
    	{
    		setBackground(Color.green);
    	}
    	if(e.getSource()==b3)
    	{
    		setBackground(Color.yellow);
    	}
    }
}

public class Formgui 
{
      public static void main(String[] args)
      {
    	  Demo1 d1 =new Demo1();
    	  d1.setVisible(true);
  		d1.setSize(400,300);
  		d1.setLocation(100,200); 
  		//t.setBackground(Color.green);
  	//	t.setForeground(Color.black);
  		d1.addWindowListener(new WindowAdapter() 
  	 	 {
  	 		 public void windowClosing(WindowEvent e)
  	 		 {
  	 			 System.exit(0);
  	 		 }
  			});
      }
}
