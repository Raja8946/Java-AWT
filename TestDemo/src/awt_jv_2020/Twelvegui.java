import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Twelvegui extends Frame    //Border Layout(By Default)
{
	//Button b1,b2;
	//TextField t1,t2,t3;
	//Label un;
	//Checkbox cb1,cb2,cb3;
	//Choice c1;
	//Checkbox c1,c2;
//	List c1;
	//CheckboxGroup c3;
	TextArea textArea;
	public Twelvegui() {
		// TODO Auto-generated constructor stub
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		//b1=new Button("Click1");
		//add(b1);
		
		//b2= new Button("Click2");
		//add(b2);
		//t1 = new TextField();
		//add(t1);
	//	un= new Label("Enter your Name");
		//add(un);
		//t2= new TextField(20);
		//add(t2);
		//t3= new TextField("Enter Name");
		//add(t3);
		
	//	cb1 = new Checkbox("JAVA");
	//	add(cb1);
	//	cb2 = new Checkbox("PHP");
	//	add(cb2);
	//	cb3 = new Checkbox("C#");
	//	add(cb3);
		//c1= new Choice();
	//	c1=new List(3);
		/*c1.add("C");
		c1.add("C++");
		c1.add("JAVA");
		c1.add("C#");
		c1.add("PHP");*/
	/*	for(int i=1990;i<=2020;i++)
		{
			c1.add(""+i);
		}
		add(c1);*/ 
		/*c3= new CheckboxGroup();

		c1= new Checkbox("Male",true,c3);
		add(c1);
		c2= new Checkbox("Female",false,c3);
				add(c2);*/
		//textArea= new TextArea("Enter Here");
		textArea = new TextArea(40,20);
		add(textArea);
		
	}
	
	public static void main(String[] args)
	{
		Twelvegui t=new Twelvegui();
		t.setVisible(true);
		t.setSize(300,300);
		t.setLocation(100,200); 
		//t.setBackground(Color.green);
	//	t.setForeground(Color.black);
		t.addWindowListener(new WindowAdapter() 
	 	 {
	 		 public void windowClosing(WindowEvent e)
	 		 {
	 			 System.exit(0);
	 		 }
			});
	 	 
		
	}

}
