package swing_jv_gui_2020;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Demo6 extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton[] buttons = new JButton[20];
	JTextField tx1;
	int k=0;
	public Demo6() 
	{
		setLayout(null);
		setTitle("CALCULATOR");
		Font font = new Font("", Font.BOLD, 20);
		int x=0;
		int y=60;
		int w=80;
		int h= 45;
		// TODO Auto-generated constructor stub
		tx1 = new JTextField();
		tx1.setSize(300,60);
		tx1.setLocation(0,0);
		tx1.setFont(font);
		tx1.setHorizontalAlignment(JTextField.RIGHT);
		add(tx1);
		
		for (int i = 0; i < 5; i++) 
		{
		   for (int j = 0; j < 4; j++) 
		   {
			buttons[k]= new JButton() ;
			buttons[k].setSize(w,h);
			buttons[k].setLocation(x,y);
			buttons[k].setFont(font);
			buttons[k].addActionListener(this);
			add(buttons[k]);
			k++;
			x=x+80;
			
		}	
		   x=0;
		   y=y+45;
		}
		   
		   buttons[0].setLabel("B");
		   buttons[1].setLabel("C");
		   buttons[2].setLabel("1/x");
		   buttons[3].setLabel("sqrt");
		   buttons[4].setLabel("7");
		   buttons[5].setLabel("8");
		   buttons[6].setLabel("9");
		   buttons[7].setLabel("/");
		   
		   buttons[8].setLabel("4");
		   buttons[9].setLabel("5");
		   buttons[10].setLabel("6");
		   buttons[11].setLabel("*");
		   
		   buttons[12].setLabel("1");
		   buttons[13].setLabel("2");
		   buttons[14].setLabel("3");
		   buttons[15].setLabel("-");
		   
		   
		   buttons[16].setLabel("0");
		   buttons[17].setLabel(".");
		   buttons[18].setLabel("=");
		   buttons[19].setLabel("+");
		   
		   
		   
		   
		   
		   
		   
		   setResizable(false);
		   
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	
		// TODO Auto-generated method stub
		if(e.getSource()==buttons[0])
		{
			String s1 = tx1.getText();
			tx1.setText(s1.substring(0, s1.length()-1));
		}
		else if (e.getSource()==buttons[1]) 
		{
			tx1.setText("");
		}
		else if (e.getSource()==buttons[2]) 
		{
			String s1= tx1.getText();
			double a= Double.parseDouble(s1);
			a=1/a;
			tx1.setText(""+a);
		}
		else if (e.getSource()==buttons[3]) 
		{
			String s1= tx1.getText();
			double a = Double.parseDouble(s1);
			tx1.setText(""+Math.sqrt(a));
		}
		else if (e.getSource()==buttons[18]) 
		{
			String s1 = tx1.getText();
			ScriptEngineManager semEngineManager = new ScriptEngineManager();// Scriptenginemanager to perform = operation
			ScriptEngine sEngine=semEngineManager.getEngineByName("js");
			try 
			{
			  tx1.setText(""+sEngine.eval(s1));	
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		else {
			
			JButton b1= (JButton)e.getSource();
	 
	   String string = tx1.getText()+ b1.getLabel();
	   tx1.setText(string);
			}
	}
}

public class Final_Calc_gui_swing 
{
    @SuppressWarnings("static-access")
	public static void main(String[] args) 
    {
	  Demo6 demo6 = new Demo6();
	  demo6.setVisible(true);
	  demo6.setSize(300,316);
	  demo6.setLocation(0,100);
	  
	  demo6.setDefaultCloseOperation(demo6.EXIT_ON_CLOSE);
	  
	}
}
