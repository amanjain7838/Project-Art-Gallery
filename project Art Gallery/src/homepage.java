import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class homepage extends Frame implements ActionListener {
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
			   
	public static JPanel p2 = new JPanel();
    public static JLabel scrollimage = new JLabel();

   
    public static JLabel leftsideimage= new JLabel();
    public static JLabel rightsideimage= new JLabel();
     
    public static JButton leftimagebutton=new JButton();
    public static JButton rightimagebutton=new JButton();
    
    public static JButton i1b = new JButton();
    public static JButton i2b = new JButton();
    public static JButton i3b = new JButton();
    public static JButton i4b = new JButton();
    public static JButton i5b = new JButton();
    public static JButton i6b = new JButton();
    
    
    ImageIcon[] scrollicon=new ImageIcon[3];
	homepage()
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
 		    
		    
		    
		    //path of image
		    scrollicon[0] = new ImageIcon("res/scrollimage0.jpg");
		    scrollicon[1]=new ImageIcon("res/scrollimage1.jpg");
		    scrollicon[2]=new ImageIcon("res/scrollimage2.jpg");
		    //scroll image main
		    scrollimage.setIcon(scrollicon[0]);
		    scrollimage.setBounds(228,130,890,250);
		    
		    
		    //button on main scroll image
		    leftimagebutton.setBounds(421, 347, 50,30);
		    rightimagebutton.setBounds(836, 347, 50, 30);
		    leftimagebutton.addActionListener(this);
		    rightimagebutton.addActionListener(this);
		    
		    //side images
			leftsideimage.setIcon(new ImageIcon("res/extremeleft.jpg"));
		    leftsideimage.setBounds(0,130,224,638);
		    rightsideimage.setIcon(new ImageIcon("res/extremeright.jpg"));
		    rightsideimage.setBounds(1122,130,240,638);
		   
		    
		    
		    //small images
		    
		    i1b.setBounds(234, 390, 140, 175);
		    i1b.setIcon(new ImageIcon("res/i1.jpg"));
		    f.add(i1b);
		    
		    i2b.setBounds(534, 390, 140, 175);
		    i2b.setIcon(new ImageIcon("res/i2.jpg"));
		    f.add(i2b);
		    
		    i3b.setBounds(834, 390, 140, 175);
		    i3b.setIcon(new ImageIcon("res/i3.jpg"));
		    f.add(i3b);
		    
		    i4b.setBounds(234, 568, 140, 170);
		    i4b.setIcon(new ImageIcon("res/i4.jpg"));
		    f.add(i4b);
		    
		    i5b.setBounds(534, 568, 140, 170);
		    i5b.setIcon(new ImageIcon("res/i5.jpg"));
		    f.add(i5b);
		    
		    i6b.setBounds(834, 568, 140, 170);
		    i6b.setIcon(new ImageIcon("res/i6.jpg"));
		    f.add(i6b);
		   
		    
		    
		   
		    
		    f.add(b1);
		    f.add(b2);
		    f.add(b3);
		    f.add(b4);
		    f.add(b5);
		   f.add(b6);
		    f.add(leftimagebutton);
		    f.add(rightimagebutton);
		    f.add(leftsideimage);
		    f.add(rightsideimage);
		    f.add(scrollimage);
	

		    
    
    
    
    //adding frame
   
    f.add(min);
    
    f.add(close); f.add(l);
    
    
    
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
	
	//image scroll button
	else if(e.getSource()==leftimagebutton||e.getSource()==rightimagebutton)
	{	//increment decrement
		if(e.getSource()==leftimagebutton)
		{if(count>0)count--;}
		if(e.getSource()==rightimagebutton)
		{if(count<scrollicon.length-1)count++;}
		
		{scrollimage.setIcon(scrollicon[count]);}
				
		
	}
	 
	 
	}
		
		
	
	
	
	public static void main(String args[])
{
		new homepage();
		
	    
		
}
}
