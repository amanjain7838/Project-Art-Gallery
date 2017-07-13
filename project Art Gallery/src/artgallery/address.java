package artgallery;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.*;

public class address extends variabledecl implements ActionListener {

    
    
	address()
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
    addressframe.add(mainlogo);
    JLabel tagline = new JLabel("       Paint the world");
    tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
    tagline.setForeground(Color.WHITE);
    tagline.setBounds(15, 40, 300, 90);
    addressframe.add(tagline);
  
      
      
    b1.setBounds(10,100,220,28);
    b1.setBackground(Color.WHITE);
    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
      	  
      	new HomePage();
      	addressframe.setVisible(false);
      	addressframe.dispose();
      	 
      	  
        }
    });
    
        
    b2.setBounds(230,100,220,28);
    b2.setBackground(Color.WHITE);
    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
      	  
      	new UpSign();
      	addressframe.setVisible(false);
      	addressframe.dispose();
      	 
      	  
        }
    });
    
    
    b3.setBounds(450,100,220,28);
    b3.setBackground(Color.WHITE);
    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
      	  
      	new LoginPP();
      	 
      	  
        }
    });
    //b4.setBounds(670,100,220,28);
    //b4.setBackground(Color.WHITE);
        
    b5.setBounds(890,100,220,28);
    b5.setBackground(Color.WHITE);
    b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
      	  
      	new About();
      	addressframe.setVisible(false);
      	addressframe.dispose();
      	 
      	  
        }
    });
    
  b6.setBounds(1100,100,220,28);
   b6.setBackground(Color.WHITE);
   b6.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ev) {
     	  
     	new ContactUs();
     	addressframe.setVisible(false);
     	addressframe.dispose();
     	 
     	  
       }
   });    
   
 //item1 
   make.add(item1);
  item1.setOpaque(true);
  item1.setBackground(Color.WHITE);
  item1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
      	new popularimages();
      	addressframe.setVisible(false);
      	addressframe.dispose();
      }
  });
  
  //item2
  
  make.add(item2);
  item2.setOpaque(true);
  item2.setBackground(Color.WHITE);
  item2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
      	new popularimages();
      	addressframe.setVisible(false);
      	addressframe.dispose();
      }
  });
  
  
  
  make.add(item3);
  item3.setOpaque(true);
  item3.setBackground(Color.WHITE);
  item3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
      	new popularimages();
      	addressframe.setVisible(false);
      	addressframe.dispose();
      }
  });
  
  
  
  make.add(item4);
  item4.setOpaque(true);
  item4.setBackground(Color.WHITE);
  item4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
      	new popularimages();
      	addressframe.setVisible(false);
      	addressframe.dispose();
      }
}); 
   
     menuBar.add(make);
     menuBar.setBounds(670,100,220,28);
     menuBar.setBackground(Color.WHITE);
     addressframe.add(menuBar);
    

        
		    addressframe.add(b1);
		    addressframe.add(b2);
		    addressframe.add(b3);
		//    addressframe.add(b4);
		    addressframe.add(b5);
		   addressframe.add(b6);
	
		   
		   
		     JLabel frameback = new JLabel();
		     frameback.setBounds(0, 110, 1365, 700);
		     ImageIcon backgr = new ImageIcon("res/ship.jpg");
		     frameback.setIcon(backgr);

		     
			    addname.setBounds(20,220,120,120);
				      addname.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 20));
			       addname.setForeground(Color.WHITE);
			       
			    addressframe.add(addname);
			    addnametext.setBounds(20,305,450,30);
			    
			    addressframe.add(addnametext);
			    
			    
			    addphone.setBounds(20,360,400,20);
			    addphone.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 20));
			       addphone.setForeground(Color.WHITE);
			       addressframe.add(addphone);
			       addphonetext.setBounds(20,385,450,30);
			 	  
			       addressframe.add(addphonetext);
			       
			       
			       addmsg.setBounds(20,440,220,20);
				    addmsg.setFont(new Font("Lucida Sans Typewrite", Font.BOLD, 20));
				      addmsg.setForeground(Color.WHITE);
				    addressframe.add(addmsg);
				    addmsgtext.setBounds(20,470,400,150);
				    addressframe.add(addmsgtext);
    
				    
				    addpay.setBounds(80,640,250,30);
				    addpay.addActionListener(new ActionListener() {
				         public void actionPerformed(ActionEvent ev) {
				        	 if(addnametext.getText().isEmpty()||addphonetext.getText().isEmpty()||addmsgtext.getText().isEmpty())
				        	 {JOptionPane.showMessageDialog(null, "Please fill in the entries.");}
				        	 else{
				        		 JFrame proceed = new JFrame("Proceed To Pay");
				 			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				 			  proceed.setLocation(dim.width/2-proceed.getSize().width/2, dim.height/2-proceed.getSize().height/2);
				 			JLabel to = new JLabel("Are you sure?");
				 			to.setBounds(30, 50, 300, 30);
				 	
				 			proceed.add(to);
				 			
				 			JButton payment = new JButton("Go To Payment Page");
				 			payment.setBounds(30,80,180,50);
				 			payment.addActionListener(new ActionListener() {
				 		         public void actionPerformed(ActionEvent ev) {
				 		          	new Payment();
				 		          	addressframe.setVisible(false);
				 		          	addressframe.dispose();
  ;
				 		         }
				 		     });
				 		     proceed.add(payment);
				 			JTextField numb = new JTextField();
							numb.setBounds(30, 80, 200, 30);
							proceed.add(numb);
				 			proceed.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				 			proceed.setVisible(true);
				 			proceed.setLayout(null);
				 		    proceed.setSize(250,250);
				         }}
				     });
    
    addressframe.add(addpay);
    //adding frame
   addressframe.add(frameback);
    addressframe.add(min);
    
    addressframe.add(close); addressframe.add(l);
    
    
    
    addressframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	  

    addressframe.setSize(1366,768);
    addressframe.setUndecorated(true);
    addressframe.setVisible(true);
    
    
	
	
	
}
	int count=0;
	public void actionPerformed(ActionEvent e)
	{if(e.getSource()==close)
		{System.exit(0);}
	else if(e.getSource()==min)
	{addressframe.setState(JFrame.ICONIFIED);
	}
	
	
	 
	 
	}
		
		
	
	

}
