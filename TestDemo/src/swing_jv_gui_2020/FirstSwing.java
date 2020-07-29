package swing_jv_gui_2020;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

class SDemo1 extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	       public SDemo1() 
	       {
	    	   setLayout(new FlowLayout());
	    	   Font font = new Font("", Font.BOLD, 20);// importing from awt 
			/*JButton b= new JButton("Click Here"); // Add  Swing Button
			add(b);
			Button b1 = new Button("Click");
			add(b1);
	    	   JTextField textField= new JTextField(20); //Text field
	    	   add(textField);
	    	   JLabel jl = new JLabel("Enter Password");
	    	   jl.setFont(font);// Label
	    	   add(jl);
	    	   JPasswordField j=new JPasswordField(10); // Password Field
	    	   j.setEchoChar('?'); //To display any character in echo field
	    	   j.setFont(font);
	    	   add(j);
	    	 //  setResizable(false);
	    	    ButtonGroup bGroup = new ButtonGroup();
	    	   JRadioButton b1=new JRadioButton("Male");
	    	   b1.setFont(font);
	    	   bGroup.add(b1);
	    	   add(b1);
	    	   JRadioButton b2= new JRadioButton("Female");
	    	   b2.setFont(font);
	    	   bGroup.add(b2);
	    	   add(b2);*/
	    	   String s[]= {"Java","PHP","C","C++","PYTHON","RUBY","node.js","M/L","IT SECURITY","Ethical Hacking"};
			//JComboBox<String> cBox1= new JComboBox<String>(s);// Same as Choicebox in awt
	    	   //cBox1.addItem("JAVA");
	    	   //cBox1.addItem("PHP");
	    	   JList cJList = new JList(s);
	    	   cJList.setVisibleRowCount(5);
	    	   add(new JScrollPane(cJList));
	    	   
	    	   // TODO Auto-generated constructor stub
		}
	
}

public class FirstSwing 
{
   @SuppressWarnings("static-access")
public  static void  main(String[] args) 
   {
	 SDemo1 s = new SDemo1();
	 s.setVisible(true);
	 s.setSize(500,250);
	 s.setLocation(10,100);
	 s.setDefaultCloseOperation(s.EXIT_ON_CLOSE);
	 
}
}
