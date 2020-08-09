package awt_jv_2020;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Demo2 extends Frame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1;
	TextField t1;
	public Demo2() {
		// TODO Auto-generated constructor stub
		FlowLayout flowLayout = new FlowLayout();
		setLayout(flowLayout);
		t1=new TextField(20);
		add(t1);
		b1 = new Button("Click");
		add(b1);
		b1.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		t1.setText("Hello Raj Sonam");
		
		
	}
}

public class Form2gui 
{
	   public static void main(String[] args)
	      {
	    	  Demo2 d2 =new Demo2();
	    	  d2.setVisible(true);
	  		d2.setSize(400,300);
	  		d2.setLocation(100,200); 
	  		//t.setBackground(Color.green);
	  	//	t.setForeground(Color.black);
	  		d2.addWindowListener(new WindowAdapter() 
	  	 	 {
	  	 		 public void windowClosing(WindowEvent e)
	  	 		 {
	  	 			 System.exit(0);
	  	 		 }
	  			});
}
}
