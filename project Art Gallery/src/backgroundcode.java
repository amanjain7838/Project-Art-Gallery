import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class backgroundcode extends Frame implements ActionListener {
	public static	JLabel l=new JLabel();
	public static   JButton close=new JButton();
	public static 	JButton min=new JButton();

	public static JFrame f=new JFrame("Art Gallery");
	public static JPanel p = new JPanel();
	public static JButton b1 = new JButton("Home");
	public static JButton b2 = new JButton("Register");
	public static JButton b3 = new JButton("Login");
	public static JButton b4 = new JButton("Home");
	public static JButton b5 = new JButton("Register");
	public static JButton b6 = new JButton("Contact");
			   
    
	backgroundcode()
{	l.setBounds(0,0,1366,768);
	ImageIcon icon = new ImageIcon("res/framebackground.jpg");
    l.setIcon(icon);
 
    
    min.setBounds(1252,6,50,51);
    close.setBounds(1316,6,50,51);
    
   close.setOpaque(false);
   close.setContentAreaFilled(false);
   close.setBorderPainted(false);
   close.addActionListener(this);
  
   min.setOpaque(false);
   min.setContentAreaFilled(false);
   min.setBorderPainted(false);
   
   
    min.addActionListener(this);
   
    
    JLabel mainlogo = new JLabel("Art Gallery..");
    mainlogo.setFont(new Font("Monotype Corsiva", Font.BOLD, 45));
    mainlogo.setForeground(Color.WHITE);
    mainlogo.setBounds(10, 10, 300, 90);
    f.add(mainlogo);
    JLabel tagline = new JLabel("       Paint the world");
    tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
    tagline.setForeground(Color.WHITE);
    tagline.setBounds(15, 40, 300, 90);
    f.add(tagline);
  
      
      
      
      b1.setBounds(10,100,220,28);
      b1.setBackground(Color.WHITE);
          
      b2.setBounds(230,100,220,28);
      b2.setBackground(Color.WHITE);
      
      b3.setBounds(450,100,220,28);
      b3.setBackground(Color.WHITE);
      
      b4.setBounds(670,100,220,28);
      b4.setBackground(Color.WHITE);
          
      b5.setBounds(890,100,220,28);
      b5.setBackground(Color.WHITE);
      
    b6.setBounds(1100,100,220,28);
     b6.setBackground(Color.WHITE);
 		    
		    
		    
		    
		    f.add(b1);
		    f.add(b2);
		    f.add(b3);
		    f.add(b4);
		    f.add(b5);
		   f.add(b6);
	

		    
    
    
    
    //adding frame
   
    f.add(min);
    
    f.add(close); 
    
    
    
    
    
    
    
    
    
    
    //image label
    f.add(l);
    
    
    
	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	  

    f.setSize(1366,768);
    f.setUndecorated(true);
    f.setVisible(true);
    
    
	
	
	
}
	int count=0;
	public void actionPerformed(ActionEvent e)
	{if(e.getSource()==close)
		{System.exit(0);}
	else if(e.getSource()==min)
	{f.setState(JFrame.ICONIFIED);
	}
	
	
	 
	 
	}
		
		
	
	
	
	public static void main(String args[])
{
		new backgroundcode();
		
	    
		
}
}
