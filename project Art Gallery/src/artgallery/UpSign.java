package artgallery;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

import javax.swing.*;

public class UpSign {
		
	
	
	UpSign()
	{
		JLabel l=new JLabel();
		   JButton close=new JButton();
		 	JButton min=new JButton();

		 JFrame upsignf=new JFrame();
		 JPanel p = new JPanel();
		 JButton b1 = new JButton("Home");
		 JButton b2 = new JButton("Register");
		 JButton b3 = new JButton("Login");
		// JButton b4 = new JButton("Home");
		 JButton b5 = new JButton("About Us");
		 JButton b6 = new JButton("Contact");
		JRadioButton c1 = new JRadioButton("Artist");
			JRadioButton c2=new JRadioButton("Customer");
				ButtonGroup bg = new ButtonGroup();

		 JLabel left= new JLabel();
		 JLabel right= new JLabel();
		 JLabel line = new JLabel("                Hello NewUser SIGNUP !!!!");
		   JLabel name = new JLabel("NAME*");
		   JLabel username = new JLabel("USERNAME*");
		   JTextField usernametext = new JTextField();
		   JLabel password = new JLabel("PASSWORD*");
		   JLabel gal = new JLabel();
		  
		   JTextField nametext = new JTextField();
		   JPasswordField passwordtext = new JPasswordField();
		   JLabel cpassword = new JLabel("CONFIRM PASSWORD*");
		   JPasswordField cpasswordtext = new JPasswordField();
		   JLabel entry = new JLabel("USER ENTRY TYPE*");
		   JButton b = new JButton("Sign Up");
		
		   JMenuBar menuBar = new JMenuBar();
		     JMenu make = new JMenu("Genre                                                             ");
		     JMenuItem item1 = new JMenuItem("Popular Artwork                                           ");
		     JMenuItem item2 = new JMenuItem("Modern Art");		   
		     JMenuItem item3 = new JMenuItem("Abstract Art");
		     JMenuItem item4 = new JMenuItem("Scenery Art");
		     JMenuItem item5 = new JMenuItem("Portrait Art");
		     JMenuItem item6 = new JMenuItem("Still Life Art");
		  
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
			    	  upsignf.setState(JFrame.ICONIFIED);}
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
		     upsignf.add(mainlogo);
		     JLabel tagline = new JLabel("       Paint the world");
		     tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
		     tagline.setForeground(Color.WHITE);
		     tagline.setBounds(15, 40, 300, 90);
		     upsignf.add(tagline);
		   
		       
		       
		       
		     b1.setBounds(10,100,220,28);
		     b1.setBackground(Color.WHITE);
		     b1.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent ev) {
		       	  
		           	new HomePage();

		       	upsignf.setVisible(false);
		       	upsignf.dispose();
		       	 
		       	  
		         }
		     });
		     
		         
		     b2.setBounds(230,100,220,28);
		     b2.setBackground(Color.WHITE);
		     b2.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent ev) {
		       	  
		       	 
		       	  
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
		       upsignf.setVisible(false);
		       	upsignf.dispose();
		       	 
		       	  
		         }
		     });
		     
		   b6.setBounds(1100,100,220,28);
		    b6.setBackground(Color.WHITE);
		    b6.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent ev) {
		      	  
		      	new ContactUs();
		      	upsignf.setVisible(false);
		      	upsignf.dispose();
		      	 
		      	  
		        }
		    });    
		    
		  //item1 
		    make.add(item1);
		   item1.setOpaque(true);
		   item1.setBackground(Color.WHITE);
		   item1.addActionListener(new ActionListener() {
		       public void actionPerformed(ActionEvent ev) {
		       	new popularimages();
		          	upsignf.setVisible(false);
		          	upsignf.dispose();
		       }
		   });
		   
		   //item2
		   
		   make.add(item2);
		   item2.setOpaque(true);
		   item2.setBackground(Color.WHITE);
		   item2.addActionListener(new ActionListener() {
		       public void actionPerformed(ActionEvent ev) {
		       	new popularimages();
		          	upsignf.setVisible(false);
		          	upsignf.dispose();
		       }
		   });
		   
		   
		   
		   make.add(item3);
		   item3.setOpaque(true);
		   item3.setBackground(Color.WHITE);
		   item3.addActionListener(new ActionListener() {
		       public void actionPerformed(ActionEvent ev) {
		       	new popularimages();
		          	upsignf.setVisible(false);
		          upsignf.dispose();
		       }
		   });
		   
		   
		   
		   make.add(item4);
		   item4.setOpaque(true);
		   item4.setBackground(Color.WHITE);
		   item4.addActionListener(new ActionListener() {
		       public void actionPerformed(ActionEvent ev) {
		       	new popularimages();
		                 upsignf.setVisible(false);
		          	upsignf.dispose();
		       }
		 });
		      menuBar.add(make);
		      menuBar.setBounds(670,100,220,28);
		      menuBar.setBackground(Color.WHITE);
		      upsignf.add(menuBar);
		     
		      
		      
		      
		 	//adding side images
		    
		      left.setIcon(new ImageIcon("res/extremeleft.jpg"));
		        left.setBounds(0,130,224,638);
		        right.setIcon(new ImageIcon("res/extremeright.jpg"));
		        right.setBounds(1122,130,240,638);
		      
		        
		        //signup page
		        
		        name.setBounds(300, 280, 400, 20);
		        nametext.setBounds(300, 310, 400, 30);
		        upsignf.add(name);
		        upsignf.add(nametext);
		         //
		        
		        line.setBounds(250,200,700,30);
		        line.setFont(new Font("Curlz MT", Font.BOLD, 35));
		        line.setForeground(Color.BLACK);
		        
		        upsignf.add(line);
		        
		        username.setBounds(300, 350,400, 20);
		        usernametext.setBounds(300, 380,400, 30);
		        upsignf.add(username);
		        upsignf.add(usernametext);
		        
		        
		        
		        
		        password.setBounds(300, 420, 400, 20);
		        passwordtext.setBounds(300, 450, 400, 30);
		       upsignf.add(password);
		        upsignf.add(passwordtext);
		        
		        
		        
		        cpassword.setBounds(300, 490, 400, 20);
		        cpasswordtext.setBounds(300, 520, 400, 30);
		        upsignf.add(cpassword);
		        upsignf.add(cpasswordtext);
		        
		        //checkbox
		        
		        entry.setBounds(300, 560, 400, 20);
		      		    c1.setBounds(400, 590, 100, 30);
		      			c2.setBounds(600, 590, 100, 30);
		      			bg.add(c1);
		      			bg.add(c2);
		      			c1.setOpaque(false);
		      			c2.setOpaque(false);
		      upsignf.add(entry);
		      
		      upsignf.add(c1);
		      upsignf.add(c2);
		     // f.add(bg);

		      //button

		      		
		      		b.setBounds(600, 655, 95, 30);
		      		b.addActionListener(new ActionListener() {
		      		    
		                 public void actionPerformed(ActionEvent ev) {
		                   char[] p = passwordtext.getPassword();
		                   char[] c = cpasswordtext.getPassword();
		                   if (Arrays.equals(p,c)) {
		                        try{
		                     		Class.forName("oracle.jdbc.driver.OracleDriver");  
		                 			Connection con=DriverManager.getConnection(  
		                 			"jdbc:oracle:thin:@localhost:1521:xe","artdetails","tiger");  
		                 			      
		                 			PreparedStatement ps;
		                 			ps=con.prepareStatement("insert into users values(?,?,?,?)");  
		                 			ps.setString(1,usernametext.getText());
		                 			ps.setString(2,nametext.getText());
		                 			ps.setString(3,String.valueOf(p));
		                 			if(c1.isSelected()==true)
		                 			ps.setString(4,"Artist");
		                 			else if(c2.isSelected()==true)
		                 			{ps.setString(4,"Customer");}
		                 			else {JOptionPane.showMessageDialog(null,"Please check a user entry type");}
		                 			ResultSet rs;
		                 			if(c1.isSelected()==true||c2.isSelected()==true)
		                 			{rs=ps.executeQuery();  
		                 			JOptionPane.showMessageDialog(null, "Account Created");
		                             
		                 			}
		                 		
		                        }
		                        catch(Exception e)
		                        {JOptionPane.showMessageDialog(null,"Username already exists");}
		                        
		                        
		                        
		                     } else {
		                        JOptionPane.showMessageDialog(null, "Passwords do not match");
		                     }
		                 
		                 
		                 
		                     
		                     
		                     
		                 }   
		         });	
		      		
		                upsignf.add(b);

		      //image
		      		gal.setIcon(new ImageIcon("res/gal.jpg"));
		      		gal.setBounds(710, 280, 400, 405);
		      		upsignf.add(gal);
		      		
		      		
		 		    
		 		    upsignf.add(left);
		 		    upsignf.add(right);
		 		    upsignf.add(b1);
		 		    upsignf.add(b2);
		 		    upsignf.add(b3);
		 	//	    f.add(b4);
		 		    upsignf.add(b5);
		 		   upsignf.add(b6);
		 	 

		 		    
		     
		     
		     
		     //adding frame
		    
		     upsignf.add(min);
		     
		     upsignf.add(close); upsignf.add(l);
		     
		     
		     
		 	upsignf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		 	  

		     upsignf.setSize(1366,768);
		     upsignf.setUndecorated(true);
		     upsignf.setVisible(true);

	    
		
}
}
