package swing_jv_gui_2020;

import java.awt.Font;

import javax.swing.*;


class SDemo2 extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SDemo2()
	{
		//setLayout(new FlowLayout());
		setLayout(null);
		Font font = new Font("", Font.BOLD, 20);
		/*JLabel j3= new JLabel("Login Form");
		j3.setSize(300,80);
		j3.setLocation(160,00);
		j3.setFont(font);
		add(j3);*/
		setTitle("Login Page"); //Setting Title on top
	
		
		JLabel j1 = new JLabel(" Enter Username");
		j1.setSize(250,100);
		j1.setLocation(40,40);
		j1.setFont(font);
		add(j1);
		JTextField tx1 = new JTextField(20);
		tx1.setSize(200,30);
		tx1.setLocation(250,75);
		tx1.setFont(font);
		add(tx1);
		
		JLabel j2 = new JLabel(" Enter Password");
		j2.setSize(250,100);
		j2.setLocation(40,85);
		j2.setFont(font);
		add(j2);
		JPasswordField ps1 = new JPasswordField(15);
		ps1.setSize(200,30);
		ps1.setLocation(250,120);
		ps1.setFont(font);
		add(ps1);
		
		JButton button= new JButton("Login");
		button.setSize(100,30);
		button.setLocation(200,170);
		button.setFont(font);
		add(button);
		
		//setResizable(false);
	}
	
}

public class Loginform_swing_gui 
{
  @SuppressWarnings("static-access")
public static void main(String[] args) 
  {
	SDemo2 s2=new SDemo2();
	s2.setVisible(true);
	s2.setSize(500,300);
	s2.setLocation(10,100);
	s2.setDefaultCloseOperation(s2.EXIT_ON_CLOSE);
}
}
