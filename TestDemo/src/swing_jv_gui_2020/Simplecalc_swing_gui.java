package swing_jv_gui_2020;

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class Demo4 extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;
JTextField t1,t2,t3;
public Demo4()
{
	// TODO Auto-generated constructor stub
	setLayout(null);
	setTitle("Calculator");
	t1= new JTextField();
	t1.setSize(80,30);
	t1.setLocation(60,80);
	add(t1);
	t2= new JTextField();
	t2.setSize(80,30);
	t2.setLocation(150,80);
	add(t2);
	b1=new JButton("+");
	b1.setSize(45,30);
	b1.setLocation(05,120);
	add(b1);
	b2=new JButton("-");
	b2.setSize(45,30);
	b2.setLocation(65,120);
	add(b2);
	b3=new JButton("*");
	b3.setSize(45,30);
	b3.setLocation(125,120);
	add(b3);
	b4= new JButton("/");
	b4.setSize(45,30);
	b4.setLocation(185,120);
	add(b4);
	b5=new JButton("%");
	b5.setSize(50,30);
	b5.setLocation(240,120);
	add(b5);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	t3=new JTextField();
	t3.setSize(100,30);
	t3.setLocation(90,160);
	add(t3);
	
	
	
	
	setResizable(false);
	
	
	
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

public class Simplecalc_swing_gui 
{
     @SuppressWarnings("static-access")
	public static void main(String[] args) 
     {
		Demo4 demo4 = new Demo4();
		demo4.setVisible(true);
		demo4.setSize(400,300);
		demo4.setLocation(50,100);
		demo4.setDefaultCloseOperation(demo4.EXIT_ON_CLOSE);
	}
}
