package artgallery;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.*;

public class ContactUs  {

	
		
		
	
	
	
	ContactUs()
{int count=0;

		 	JLabel l=new JLabel();
		    JButton close=new JButton();
		  	JButton min=new JButton();

		  JFrame contactframe=new JFrame();
		  JPanel p = new JPanel();
		  JButton b1 = new JButton("Home");
		  JButton b2 = new JButton("Register");
		  JButton b3 = new JButton("Login");
		//  JButton b4 = new JButton("Home");
		  JButton b5 = new JButton("About Us");
		  JButton b6 = new JButton("Contact");
		  JMenuBar menuBar = new JMenuBar();
	      JMenu make = new JMenu("Genre                                                             ");
	      JMenuItem item1 = new JMenuItem("Popular Artwork                                           ");
	      JMenuItem item2 = new JMenuItem("Modern Art");		   
	      JMenuItem item3 = new JMenuItem("Abstract Art");
	      JMenuItem item4 = new JMenuItem("Scenery Art");
	      JMenuItem item5 = new JMenuItem("Portrait Art");
	      JMenuItem item6 = new JMenuItem("Still Life Art");
	      JLabel contactus = new JLabel("Contact US");
	    
	      JLabel name = new JLabel("Name:*");
	  
	      JLabel email = new JLabel("email:*");
	      JLabel phone = new JLabel("Phone Number:*");
	     JLabel subject = new JLabel("Subject:*");
	      JLabel msg = new JLabel("Message:*");
	    
	    
	    
	      JTextField nametext = new JTextField();
	      JTextField protype = new JTextField();
	      JTextField phonetext = new JTextField();
	      JTextField emailtext = new JTextField();
	      JTextField subtext = new JTextField();
	    
	      JTextArea msgtext = new JTextArea();
	      JButton send = new JButton("Send");
	      JButton reset = new JButton("Reset"); 
	    
	    

	    l.setBounds(0,0,1366,768);
		ImageIcon icon = new ImageIcon("res/framebackground.jpg");
	    l.setIcon(icon);
	 
	    
	    min.setBounds(1252,6,50,51);
	    close.setBounds(1316,6,50,51);
	    
	   close.setOpaque(false);
	   close.setContentAreaFilled(false);
	   close.setBorderPainted(false);

	   
	   
	   
	   
	   
	   min.setOpaque(false);
	   min.setContentAreaFilled(false);
	   min.setBorderPainted(false);
	   min.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ev) {
		    	  contactframe.setState(JFrame.ICONIFIED);}
		});
	   close.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ev) {
		    	  System.exit(0);
		    	  }
		});

	   
	    
	    
	    JLabel mainlogo = new JLabel("Art Gallery..");
	    mainlogo.setFont(new Font("Monotype Corsiva", Font.BOLD, 45));
	    mainlogo.setForeground(Color.WHITE);
	    mainlogo.setBounds(10, 10, 300, 90);
	    contactframe.add(mainlogo);
	    JLabel tagline = new JLabel("       Paint the world");
	    tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
	    tagline.setForeground(Color.WHITE);
	    tagline.setBounds(15, 40, 300, 90);
	    contactframe.add(tagline);
	  
	      
	      
	      	    
	     
	     JLabel frameback = new JLabel();
	     frameback.setBounds(0, 110, 1365, 700);
	     ImageIcon backgr = new ImageIcon("res/owl.jpg");
	     frameback.setIcon(backgr);
	     
	     
	     
	     
	     
	     
	     b1.setBounds(10,100,220,28);
	     b1.setBackground(Color.WHITE);
	     b1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent ev) {
	       	  
	       	new HomePage();
	       	contactframe.setVisible(false);
	       	contactframe.dispose();
	       	 
	       	  
	         }
	     });
	     
	         
	     b2.setBounds(230,100,220,28);
	     b2.setBackground(Color.WHITE);
	     b2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent ev) {
	       	  
	       	new UpSign();
	       	contactframe.setVisible(false);
	       	contactframe.dispose();
	       	 
	       	  
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
	       	contactframe.setVisible(false);
	       	contactframe.dispose();
	       	 
	       	  
	         }
	     });
	     
	   b6.setBounds(1100,100,220,28);
	    b6.setBackground(Color.WHITE);
	    b6.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	      	 
	      	  
	        }
	    });    
	    
	  //item1 
	    make.add(item1);
	   item1.setOpaque(true);
	   item1.setBackground(Color.WHITE);
	   item1.addActionListener(new ActionListener() {
	       public void actionPerformed(ActionEvent ev) {
	       	new popularimages();
	          	contactframe.setVisible(false);
	          	contactframe.dispose();
	       }
	   });
	   
	   //item2
	   
	   make.add(item2);
	   item2.setOpaque(true);
	   item2.setBackground(Color.WHITE);
	   item2.addActionListener(new ActionListener() {
	       public void actionPerformed(ActionEvent ev) {
	       	new popularimages();
	          	contactframe.setVisible(false);
	          	contactframe.dispose();
	       }
	   });
	   
	   
	   
	   make.add(item3);
	   item3.setOpaque(true);
	   item3.setBackground(Color.WHITE);
	   item3.addActionListener(new ActionListener() {
	       public void actionPerformed(ActionEvent ev) {
	       	new popularimages();
	          	contactframe.setVisible(false);
	          	contactframe.dispose();
	       }
	   });
	   
	   
	   
	   make.add(item4);
	   item4.setOpaque(true);
	   item4.setBackground(Color.WHITE);
	   item4.addActionListener(new ActionListener() {
	       public void actionPerformed(ActionEvent ev) {
	       	new popularimages();
	          	contactframe.setVisible(false);
	          	contactframe.dispose();
	       }
	});
	     menuBar.add(make);
	     menuBar.setBounds(670,100,220,28);
	     menuBar.setBackground(Color.WHITE);
	     contactframe.add(menuBar);
	    
	     
	     //Contact US Page
	     
	     contactus.setBounds(560,150,700,100);
	     contactus.setFont(new Font("Times New Roman", Font.BOLD, 40));
	     contactus.setForeground(Color.BLACK);
	     
	     contactframe.add(contactus);
		    
		    name.setBounds(40,230,120,120);
			       name.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		       name.setForeground(Color.BLACK);
		       
		    contactframe.add(name);
		    
		    email.setBounds(40,350,120,20);
		    email.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		       email.setForeground(Color.BLACK);
		       contactframe.add(email);
		       
		  phone.setBounds(20,415,200,20);
		  phone.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
	      phone.setForeground(Color.BLACK);
		    contactframe.add(phone);
		    
		    nametext.setBounds(20,305,450,30);
		    
		    contactframe.add(nametext);

		    phonetext.setBounds(20,370,450,30);
		    
		      contactframe.add(phonetext);
		 
		  emailtext.setBounds(20,435,450,30);
		  
	      contactframe.add(emailtext);
		    subject.setBounds(20,480,300,20);
		   subject.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		      subject.setForeground(Color.BLACK);
		    contactframe.add(subject);
		    subtext.setBounds(20,500,450,30);
		    
		    contactframe.add(subtext);
		   //
		    msg.setBounds(20,540,120,20);
		    msg.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		      msg.setForeground(Color.BLACK);
		    contactframe.add(msg);
		    msgtext.setBounds(20,560,400,150);
		    contactframe.add(msgtext);
		    send.setBounds(450,580,80,30);
		    send.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent ev) {
		             JOptionPane.showMessageDialog(null, "Message Sent");
		           }
		       });
		    			 
		    contactframe.add(send);
		    reset.setBounds(450,650,80,30);
		    reset.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent ev) {
		          nametext.setText(""); 
		          phonetext.setText("");
		          emailtext.setText("");
		          subtext.setText("");
		          msgtext.setText("");
		          
		         }
		     });
		    contactframe.add(reset);
		  
	     
	     

	        
			    contactframe.add(b1);
			    contactframe.add(b2);
			    contactframe.add(b3);
			//    contactframe.add(b4);
			    contactframe.add(b5);
			   contactframe.add(b6);
		

			    
	    
	    
	    
	    //adding frame
	   contactframe.add(frameback);
	    contactframe.add(min);
	    
	    contactframe.add(close); contactframe.add(l);
	    
	    

		  

	    contactframe.setSize(1366,768);
	    contactframe.setUndecorated(true);
	    contactframe.setVisible(true);
	    
	    

	    
		
}
}
