
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.jar.Attributes.Name;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.*;
public class adminorderscreen extends Frame implements ActionListener{
	public static	JLabel l=new JLabel();
	public static   JButton close=new JButton();
	public static 	JButton min=new JButton();

	public static JPanel p = new JPanel();
	public static JButton b1 = new JButton("Home");
	public static JButton b2 = new JButton("Register");
	public static JButton b3 = new JButton("Login");
	public static JButton b4 = new JButton("Home");
	public static JButton b5 = new JButton("Register");
	public static JButton b6 = new JButton("Contact");

	
	
	
	
	public static JFrame f=new JFrame("");
    
    public static JLabel pform = new JLabel("PRoduct Form");
    public static JLabel pname = new JLabel("Order ID:*");
    public static JLabel ptype = new JLabel("User ID:*");
    public static JLabel pcompany = new JLabel("Order Date:*");
    public static JLabel price = new JLabel("Order Total:*");

    public static JLabel image = new JLabel("Order Status:*");
    
    public static JTextField proname = new JTextField();
    public static JTextField protype = new JTextField();
    public static JTextField procomp = new JTextField();
    public static JTextField proprice = new JTextField();
    public static JButton save = new JButton("Update Order");
    public static JButton reset = new JButton("Reset Form"); 

 
    
    adminorderscreen(){
    	l.setBounds(0,0,1366,768);
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
        
        	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        pform.setBounds(20,200,120,20);
        
        pname.setBounds(20,240,120,20);
        proname.setBounds(20,270,350,30);
        
        ptype.setBounds(450,240,120,20);
        protype.setBounds(450,270,350,30);
        
        pcompany.setBounds(20,320,120,20);
        procomp.setBounds(20,350,350,30);
        
        price.setBounds(450,320,120,20);
        proprice.setBounds(450,350,350,30);
        image.setBounds(20,400,120,20);
        
        String status[]={"Order confirmed","Order not confirmed"};        
        JComboBox cb=new JComboBox(status);    
        cb.setBounds(20, 430,120,20);    
        f.add(cb);        
                 
        
        save.setBounds(40,485,120,30);
        reset.setBounds(200,485,100,30);

        f.add(image);
        f.add(pform);
        
        f.add(pname);
        f.add(proname);
        
        f.add(ptype);
        f.add(protype);
        
        f.add(pcompany);
        f.add(procomp);
        
        f.add(price);
        f.add(proprice);
        
       f.add(save);
       f.add(reset);
        
       //reset button
       reset.addActionListener(this);

       
       
    	  
    	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    	f.add(l);
        

        f.setSize(1366,768);
        f.setUndecorated(true);
        f.setVisible(true);
        
        
    	


        
}
    
    
    public void actionPerformed(ActionEvent e)
	{if(e.getSource()==close)
		{System.exit(0);}
	else if(e.getSource()==min)
	{f.setState(JFrame.ICONIFIED);
	}
	
	else if(e.getSource()==reset)
	{proname.setText("");
	protype.setText("");
	procomp.setText("");
	proprice.setText("");
	}
	 
	 
	}
	
    
    public static void main(String args[]) {
      new adminorderscreen();
      
    }
}