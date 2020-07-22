import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class CalculatorSelf implements Runnable, MouseListener 
{
	JFrame f = new JFrame("Calculator");
	JPanel p = new JPanel();
		
	JButton b[]= new JButton[20];
	String str[]={"CE","C","DELETE","/","7","8","9","*","4","5","6","-","1","2","3","+","±","0",".","="};
	JTextField tf,tfd;
	JTextArea tf1;
	JButton pow;
	String s0,s1,s2;
	public void run()
	{
		while(true)
		{
			Date d = new Date();
			if(d.getHours()>=12)
			{
				tf.setText(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()+" PM");
			}
			else
			{
				tf.setText(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()+" AM");
			}
			try
			{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	CalculatorSelf()
	{
		s0=s1=s2="";
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\Download.png");    
		f.setIconImage(icon);    
	
		f.add(p);
		p.setLayout(null);
		
		tfd=new JTextField(20);
		Calendar c = Calendar.getInstance(); 
		tfd.setEditable(false);
		tfd.setText(c.get(Calendar.DATE)+":"+(c.get(Calendar.MONTH)+1)+":"+c.get(Calendar.YEAR));
		tfd.setBounds(40,20,80,20);
		p.add(tfd);
		
		
		tf1= new JTextArea(350,100);
		tf1.setBounds(40,60,350,100);
		//tf1.setHorizontalAlignment(JTextField.RIGHT);
		tf1.setFont(new Font("Cooper",Font.BOLD,32));
		
		
		pow= new JButton("Power");
		pow.addMouseListener(this);
		pow.setBounds(40,180,80,20);
		
		tf= new JTextField(20);
		tf.setEditable(false);
		tf.setBounds(310,20,80,20);
		
		int x=40,y=200,l=80,h=20;
		for(int i=0;i<b.length;i++)
		{
			b[i]= new JButton(str[i]);
			if(i%4==0)
			{
				x=40;
				y=y+h+10;
				
			}
			b[i].setBounds(x,y,l,h);
			b[i].addMouseListener(this);
			b[i].setEnabled(false);
			b[i].setToolTipText(str[i]);
			x=x+l+10;
			
			p.add(b[i]);
		}
		p.add(tf);
		p.add(pow);
		p.add(tf1);
		p.add(tfd);
		
		
		f.setSize(450,450);
		f.setLocation(200,100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public void mousePressed(MouseEvent me)
	{
		
	}
	public void mouseReleased(MouseEvent me)
	{
		
	}
	public void mouseClicked(MouseEvent me)
	{
			if(me.getSource()==b[4]) 
			{
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[4].getText());
				}
				else
				{
					s0=s0+b[4].getText();
					tf1.setText(tf1.getText()+b[4].getText());
				}	
			}
			if(me.getSource()==b[5]) 
			{
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[5].getText());
				}
				else
				{
					s0=s0+b[5].getText();
					tf1.setText(tf1.getText()+b[5].getText());
				}
			}
			if(me.getSource()==b[6]) 
			{ 
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[6].getText());
				}
				else
				{
					s0=s0+b[6].getText();
					tf1.setText(tf1.getText()+b[6].getText());
				}
			}
			if(me.getSource()==b[8]) 
			{
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[8].getText());
				}
				else
				{
					s0=s0+b[8].getText();
					tf1.setText(tf1.getText()+b[8].getText());
				}
			}
			if(me.getSource()==b[9]) 
			{
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[9].getText());
				}
				else
				{
					s0=s0+b[9].getText();
					tf1.setText(tf1.getText()+b[9].getText());
				}
			}
			if(me.getSource()==b[10]) 
			{
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[10].getText());
				}
				else
				{
					s0=s0+b[10].getText();
					tf1.setText(tf1.getText()+b[10].getText());
				}
			}
			if(me.getSource()==b[12]) 
			{
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[12].getText());
				}
				else
				{
					s0=s0+b[12].getText();
					tf1.setText(tf1.getText()+b[12].getText());
				}
			}
			if(me.getSource()==b[13]) 
			{
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[13].getText());
				}
				else
				{
					s0=s0+b[13].getText();
					tf1.setText(tf1.getText()+b[13].getText());
				}
			}
			if(me.getSource()==b[14]) 
			{
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[14].getText());
				}
				else
				{
					s0=s0+b[14].getText();
					tf1.setText(tf1.getText()+b[14].getText());
				}
			}
			if(me.getSource()==b[17]) 
			{
				if(s2.equals(""))
				{	
					tf1.setText(tf1.getText()+b[17].getText());
				}
				else
				{
					s0=s0+b[17].getText();
					tf1.setText(tf1.getText()+b[17].getText());
				}
			}
			if(me.getSource()==b[0])
			{
				tf1.setText("");
				s0=s1=s2="";
			}
			if(me.getSource()==b[1])
			{
				tf1.setText("");
			}
			if(me.getSource()==b[2])
			{
				String s=tf1.getText();
				s=s.substring(0,s.length()-1);
				tf1.setText(s);
			}
			if(me.getSource()==b[3])
			{	
				s2=tf1.getText();
				s1=str[3];
				tf1.setText( s2.concat(s1)+"\n" );
			}
			if(me.getSource()==b[7])
			{
				s2=tf1.getText();
				s1=str[7];
				tf1.setText( tf1.getText().concat(str[7])+"\n" );
			}
			if(me.getSource()==b[11])
			{	
				s2=tf1.getText();
				s1=str[11];
				tf1.setText( tf1.getText().concat(str[11])+"\n" );
			}
			if(me.getSource()==b[15])
			{
				s2=tf1.getText();
				s1=str[15];
				tf1.setText( tf1.getText().concat(str[15])+"\n" );
			}








			if(me.getSource()==b[19])
			{
				int rs;
				if(s1.equals("+"))
				{	
					rs=Integer.parseInt(s2)+Integer.parseInt(s0);
					tf1.setText(Integer.toString(rs));
				}
				else if(s1.equals("-"))
				{	
					rs=Integer.parseInt(s2)-Integer.parseInt(s0);
					tf1.setText(Integer.toString(rs));
				}
				else if(s1.equals("*"))
				{	
					rs=Integer.parseInt(s2)*Integer.parseInt(s0);
					tf1.setText(Integer.toString(rs));
				}
				else if(s1.equals("/"))
				{	
					rs=Integer.parseInt(s2)/Integer.parseInt(s0);
					tf1.setText(Integer.toString(rs));
				}
				s0=s2="";
			}
			for(int i=0;i<20;i++)
			{
				if(me.getSource()==pow)
				{	
					b[i].setEnabled(true);
					tf1.setBackground(Color.black);
					tf1.setForeground(Color.white);
					pow.setText("Off");
				}
			}	
			
		
	}
	public void mouseEntered(MouseEvent me)
	{
			pow.setBackground(Color.blue);
			pow.setForeground(Color.yellow);
		
	}
	public void mouseExited(MouseEvent me)
	{
		
		pow.setBackground(Color.white);
		pow.setForeground(Color.black);
	}
	public static void main(String[] args) 
	{	
		CalculatorSelf c=new CalculatorSelf();
		Thread t = new Thread(c);
		t.start();
	}
	
	// delete.setOnClickListener(new View.OnClickListener() {
    // @Override
    // public void onClick(View view) {
        // String s=editText.getText().toString();
        // s=s.substring(0,s.lenght()-1)
        // editText.setText(s);
    // }
   // });
}
