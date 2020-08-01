package swing_jv_gui_2020;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Demo7  extends JFrame implements ActionListener
{
	JTextField tx1;
	//JCheckBox cb1,cb2;
	JButton b1;
	String string[] = {"Java","C","C++","C#","PHP","HTML","CSS"};
	public Demo7() 
	{
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		Font font = new Font("", Font.BOLD, 30);
		tx1= new JTextField(20);
		tx1.setFont(font);
		add(tx1);
		
		/*cb1= new JCheckBox("Java");
		cb1.setFont(font);
		add(cb1);
		
		cb2 = new JCheckBox("PHP");
		cb2.setFont(font);
		add(cb2);*/
		
		JComboBox<String> cBox= new JComboBox<String>(string);
		cBox.setFont(font);
		add(cBox);
		
		b1= new JButton("Click");
		b1.setFont(font);
		add(b1);
		
		b1.addActionListener(this);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String string="";
		if(cb1.isSelected())
		{
			string= cb1.getLabel();
		}
		if(cb2.isSelected())
		{
			string = string+cb2.getLabel();
		}
		tx1.setText(string);
	}
}

public class SecondSwing 
{
          public static void main(String[] args) 
          {
			Demo7 demo7= new Demo7();
			demo7.setVisible(true);
			demo7.setSize(300,300);
			demo7.setLocation(10,100);
			demo7.setDefaultCloseOperation(demo7.EXIT_ON_CLOSE);
		}
}
