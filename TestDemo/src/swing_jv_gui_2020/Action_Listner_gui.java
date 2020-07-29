package swing_jv_gui_2020;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


@SuppressWarnings("serial")
class SDemo3 extends JFrame implements ActionListener 
{
	JButton b1;
	SDemo3()
	{
		setLayout(new FlowLayout());
		Font font = new Font("", Font.BOLD, 30);
		b1= new JButton("CLICK");
		b1.setFont(font);
		add(b1);
		b1.addActionListener(this);
		
	//	setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello Swing");
		
	}
}

public class Action_Listner_gui 
{
         public static void main(String[] args) 
         {
		          SDemo3 sDemo3 = new SDemo3();
		          sDemo3.setVisible(true);
		          sDemo3.setSize(400,200);
		          sDemo3.setLocation(20,40);
		          sDemo3.setDefaultCloseOperation(sDemo3.EXIT_ON_CLOSE);
		          
		}
}
