import java.awt.*;
import java.awt.event.*;
class Demo extends Frame
{
	Label un,up;
	TextField t1,t2;
	Button b1;
	
	
	public Demo() {
		// TODO Auto-generated constructor stub
		//FlowLayout flowLayout = new FlowLayout();
		//setLayout(flowLayout);
		setLayout(null);
		un= new Label("Username");
		un.setSize(80,30);
		un.setLocation(100,80);
		add(un);
		t1 = new TextField(20);
		t1.setSize(150,25);
		t1.setLocation(190,80);
		add(t1);
		up=new Label("Password");
		up.setSize(80,30);
		up.setLocation(100,120);
		add(up);
		t2 = new TextField(20);
		t2.setSize(150,25);
		t2.setLocation(190,120);
		add(t2);
		
		b1=new Button("Login");
		b1.setSize(80,35);
		b1.setLocation(180,160);
		add(b1);
		
		
	}
}



public class Logingui 
{
    public static void main(String[] args)
    {
    	Demo d = new Demo();
    	d.setVisible(true);
		d.setSize(400,300);
		d.setLocation(100,200); 
		//t.setBackground(Color.green);
	//	t.setForeground(Color.black);
		d.addWindowListener(new WindowAdapter() 
	 	 {
	 		 public void windowClosing(WindowEvent e)
	 		 {
	 			 System.exit(0);
	 		 }
			});
    }
}
