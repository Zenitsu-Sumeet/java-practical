import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
	TextField tf;
	Button b;
	Label n,l,r;
	demo()
	{
		n = new Label("AWT reverse string Program");
		l = new Label("Enter String");
		r = new Label();
		tf = new TextField();
		b = new Button("reverse");
		n.setBounds(30,40,200,20);
		l.setBounds(30,70,150,20);
		r.setBounds(30,170,200,20);
		tf.setBounds(30,90,190,30);
		b.setBounds(30,130,190,30);
		add(n);
		add(l);
		add(r);
		add(tf);
		add(b);
		setSize(250,210);
		setLayout(null); //no Layout manager
		setVisible(true); //now frame will be visible
		b.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			String str = tf.getText();
			r.setText("Reverse of "+str+" is "+getReverse(str));
		}
	}
	public String getReverse(String str)
	{
		char ch[] = str.toCharArray();
		String rev = "";
		for(int i = ch.length-1;i>=0;i--)
		{
			rev = rev+ch[i];
		}
		return rev;
	}
	public static void main(String[] args)
	{
		demo rev = new demo();
	}
}