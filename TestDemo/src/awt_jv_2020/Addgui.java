import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Demo3 extends Frame implements ActionListener
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1,b2,b3,b4,b5;
	TextField t1,t2,t3;
	public Demo3()
	{
		// TODO Auto-generated constructor stub
		setLayout(null);
		t1= new TextField();
		t1.setSize(80,30);
		t1.setLocation(60,80);
		add(t1);
		t2= new TextField();
		t2.setSize(80,30);
		t2.setLocation(150,80);
		add(t2);
		b1=new Button("+");
		b1.setSize(40,30);
		b1.setLocation(10,120);
		add(b1);
		b2=new Button("-");
		b2.setSize(40,30);
		b2.setLocation(60,120);
		add(b2);
		b3=new Button("*");
		b3.setSize(40,30);
		b3.setLocation(110,120);
		add(b3);
		b4= new Button("/");
		b4.setSize(40,30);
		b4.setLocation(160,120);
		add(b4);
		b5=new Button("%");
		b5.setSize(40,30);
		b5.setLocation(210,120);
		add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		t3=new TextField();
		t3.setSize(100,30);
		t3.setLocation(90,160);
		add(t3);
		
	 }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	String str1=t1.getText();
	String str2= t2.getText();
	int x= Integer.parseInt(str1);
	int y= Integer.parseInt(str2);
	if(e.getSource()==b1)
	{
	int z= x+y;
	t3.setText(""+z);
	}
	if(e.getSource()==b2)
	{
	int z= x-y;
	t3.setText(""+z);
	}
	if(e.getSource()==b3)
	{
	int z= x*y;
	t3.setText(""+z);
	}
	if(e.getSource()==b4)
	{
	int z= x/y;
	t3.setText(""+z);
	}
	if(e.getSource()==b5)
	{
	int z= x%y;
	t3.setText(""+z);
	}
	
		
	}
}

public class Addgui 
{
	  public static void main(String[] args)
      {
    	  Demo3 d3 =new Demo3();
    	  d3.setVisible(true);
  		d3.setSize(300,350);
  		d3.setLocation(100,200); 
  		d3.setBackground(Color.green);
  	//	t.setForeground(Color.black);
  	Font font=new Font("Forte",Font.BOLD,20);
   	 d3.setFont(font);
  		d3.addWindowListener(new WindowAdapter() 
  	 	 {
  	 		 public void windowClosing(WindowEvent e)
  	 		 {
  	 			 System.exit(0);
  	 		 }
  			});
      }
}
