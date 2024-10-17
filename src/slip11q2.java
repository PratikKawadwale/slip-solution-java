/* Q2) Write a program to accept the username and password from user if username and password are
not same then raise "Invalid Password" with appropriate msg. */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class loginpage extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	public loginpage()
	{
		super("Login page");
		setSize(300,200);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		l1=new JLabel("UserName:");
		l2=new JLabel("Password:");
		t1=new JTextField(20);
		p1=new JPasswordField(20);
		b1=new JButton("Submit");
		b2=new JButton("CLear");
		
		add(l1);add(t1);add(l2);add(p1);add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
	  if(e.getSource()==b1)
	  {
		  if((t1.getText().equals("om"))&&(p1.getText().equals("1234567")))
		  {
			  JOptionPane.showMessageDialog(null,"Log in sucessfull");
		  }
		else
		{
				JOptionPane.showMessageDialog(null,"Incorerect Password or username");
		}
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			p1.setText("");
		}
	  }
}

public class slip11q2 
{
  public static void main(String[] args) 
  {
	new loginpage();
}
}
