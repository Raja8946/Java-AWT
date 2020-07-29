package swing_jv_gui_2020;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;



@SuppressWarnings("serial")
class Demo5 extends JFrame implements ActionListener
{
	public Demo5() 
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

public class Form_swing_gui 
{
   public static void main(String[] args) 
   {
	   Demo5 demo5 = new Demo5();
	   demo5.setVisible(true);
	   demo5.setSize(300,200);
	   demo5.setLocation(10,50);
	   demo5.setDefaultCloseOperation(demo5.EXIT_ON_CLOSE);
}
   
}
