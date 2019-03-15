import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class slip24java extends JFrame implements ActionListener
{
	JFrame fm;
	JButton b1;
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4;
	slip24java()
	{
		fm=new JFrame("number");
		fm.setLayout(null);
		fm.setSize(800,800);
		fm.setVisible(true);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1=new JButton("calculate");
		b1.setBounds(160,220,100,30);
		b1.addActionListener(this);

		l1=new JLabel("Decimal Number");
		l1.setBounds(30,100,150,20);

		t1=new JTextField(20);
		t1.setBounds(190,100,150,20);

		l2=new JLabel("Binary Number");
		l2.setBounds(30,130,150,20);

		t2=new JTextField(20);
		t2.setBounds(190,130,150,20);

		l3=new JLabel("Octal Number");
		l3.setBounds(30,160,150,20);

		t3=new JTextField(20);
		t3.setBounds(190,160,150,20);

		l4=new JLabel("Hexadecimal Number");
		l4.setBounds(30,190,150,20);

		t4=new JTextField(20);		
		t4.setBounds(190,190,150,20);
		
		fm.add(l1);
		fm.add(t1);
		fm.add(l2);
		fm.add(t2);
		fm.add(l3);
		fm.add(t3);
		fm.add(l4);
		fm.add(t4);
		fm.add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int dec=Integer.parseInt(t1.getText());
			t2.setText(""+Integer.toBinaryString(dec));
			t3.setText(""+Integer.toOctalString(dec));
			t4.setText(""+Integer.toHexString(dec));
		}
	}
	public static void main(String args[])
	{
		slip24java s=new slip24java();
	}
}
