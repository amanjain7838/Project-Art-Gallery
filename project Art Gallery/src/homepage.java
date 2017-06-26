import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.*;

public class homepage {
	public static JFrame f=new JFrame("Art Gallery");
	public static JPanel p = new JPanel();
	public static JButton b1 = new JButton("Home");
	public static JButton b2 = new JButton("Register");
	public static JButton b3 = new JButton("Contact");
	public static JButton b4 = new JButton("Home");
	public static JButton b5 = new JButton("Register");
	public static JButton b6 = new JButton("Contact");
			   
	public static JPanel p2 = new JPanel();
    public static JLabel l = new JLabel();

		
	 homepage()
	{		 JLabel mainlogo = new JLabel("Art Gallery..");
	  mainlogo.setFont(new Font("Monotype Corsiva", Font.BOLD, 45));
	  mainlogo.setForeground(Color.WHITE);
	  mainlogo.setBounds(10, 10, 300, 90);
	  f.add(mainlogo);
	  JLabel tagline = new JLabel("       Paint the world");
	  tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
	  tagline.setForeground(Color.WHITE);
	  tagline.setBounds(15, 40, 300, 90);
	  f.add(tagline);

		 p.setBounds(10,140,1320,30 );
		    p.setBackground(Color.WHITE);
		    
		    
		    
		    b1.setBounds(10,142,220,28);
		    b1.setBackground(Color.WHITE);
		        
		    b2.setBounds(230,142,220,28);
		    b2.setBackground(Color.WHITE);
		    
		    b3.setBounds(450,142,220,28);
		    b3.setBackground(Color.WHITE);
		    
		    b4.setBounds(670,142,220,28);
		    b4.setBackground(Color.WHITE);
		        
		    b5.setBounds(890,142,220,28);
		    b5.setBackground(Color.WHITE);
		    
		    b6.setBounds(1110,142,220,28);
		    b6.setBackground(Color.WHITE);
		    
		    p2.setBounds(10,172,1320,300);
		    p2.setBackground(Color.WHITE);
		    
		    ImageIcon icon = new ImageIcon("res/Art.jpg");
		    l.setIcon(icon);
		    l.setBounds(10,175,1320,280);
			    
		    
		    
		    p.add(b1);
		    p.add(b2);
		    p.add(b3);
		    p.add(b4);
		    p.add(b5);
		    p.add(b6);
		    p2.add(l);
		    f.add(b1);
		    f.add(b2);
		    f.add(b3);
		    f.add(b4);
		    f.add(b5);
		    f.add(b6);
		    
		    
		    f.add(p2);
		    f.add(p);
		    
	}
	
	
public static void main(String args[])
{
	//main logo

	//logo end
	
	
	//homebuttons and other option top home buttons
	new homepage();    

	f.getContentPane().setBackground(new java.awt.Color(255, 51, 51));	
	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	f.setSize(1368, 768);
	f.setLayout(null);
	f.setVisible(true);
}
}
