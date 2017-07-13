package artgallery;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class About  {
	
	

	
	About() {
			JLabel l=new JLabel();
		   JButton close=new JButton();
		 	JButton min=new JButton();

		 JFrame addcart=new JFrame();
		 JPanel p = new JPanel();
		 JButton b1 = new JButton("Home");
		 JButton b2 = new JButton("Register");
		 JButton b3 = new JButton("Login");
		// JButton b4 = new JButton("Home");
		 JButton b5 = new JButton("About Us");
		 JButton b6 = new JButton("Contact");
		 JMenuBar menuBar = new JMenuBar();
	     JMenu make = new JMenu("Genre                                                             ");
	     JMenuItem item1 = new JMenuItem("Popular Artwork                                           ");
	     JMenuItem item2 = new JMenuItem("Modern Art");		   
	     JMenuItem item3 = new JMenuItem("Abstract Art");
	     JMenuItem item4 = new JMenuItem("Scenery Art");
	    
	     JLabel abt = new JLabel();
	     JLabel AU = new JLabel("About Us");
	     JLabel Aboutbackground = new JLabel();
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
			    	  addcart.setState(JFrame.ICONIFIED);}
			});
		   close.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent ev) {
			    	  System.exit(0);
			    	  }
			});

		   
		    
		    JLabel mainlogo = new JLabel("Art Gallery..");
		    mainlogo.setFont(new Font("AR CENA", Font.BOLD, 45));
		    mainlogo.setForeground(Color.WHITE);
		    mainlogo.setBounds(10, 10, 300, 90);
		    addcart.add(mainlogo);
		    JLabel tagline = new JLabel("       Paint the world");
		    tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
		    tagline.setForeground(Color.WHITE);
		    tagline.setBounds(15, 40, 300, 90);
		    addcart.add(tagline);
		    
		   Aboutbackground.setBounds(10,140,650,620);
		   
		   ImageIcon backgd = new ImageIcon("res/aboutus.jpg");
		    Aboutbackground.setIcon(backgd);
		    
		    
		  
		      
		      
		    b1.setBounds(10,100,220,28);
		      b1.setBackground(Color.WHITE);
		      b1.addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent ev) {
		        	  
		        	new HomePage();
		        	addcart.setVisible(false);
		        	addcart.dispose();
		        	 
		        	  
		          }
		      });
		      
		          
		      b2.setBounds(230,100,220,28);
		      b2.setBackground(Color.WHITE);
		      b2.addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent ev) {
		        	  
		        	new UpSign();
		        	
		        	addcart.setVisible(false);
		        	addcart.dispose();
		        	 
		        	  
		          }
		      });
		      
		      
		      b3.setBounds(450,100,220,28);
		      b3.setBackground(Color.WHITE);
		      b3.addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent ev) {
		        	  
		        	new LoginPP();
		        	 
		        	  
		          }
		      });
		      b5.setBounds(890,100,220,28);
		      b5.setBackground(Color.WHITE);
		      b5.addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent ev) {
		        	  
		        	  
		          }
		      });
		      
		    b6.setBounds(1100,100,220,28);
		     b6.setBackground(Color.WHITE);
		     b6.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent ev) {
		       	  
		       	new ContactUs();
		       	
		       	 
		       	  
		         }
		     });    
		     
		   //item1 
		     make.add(item1);
		    item1.setOpaque(true);
		    item1.setBackground(Color.WHITE);
		    item1.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent ev) {
		        	new popularimages();
		        	addcart.setVisible(false);
		        	addcart.dispose();
		        }
		    });
		    
		    //item2
		    
		    make.add(item2);
		    item2.setOpaque(true);
		    item2.setBackground(Color.WHITE);
		    item2.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent ev) {
		        	new popularimages();
		           	addcart.setVisible(false);
		           	addcart.dispose();
		        }
		    });
		    
		    //item3
		    
		    make.add(item3);
		    item3.setOpaque(true);
		    item3.setBackground(Color.WHITE);
		    item3.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent ev) {
		        	new popularimages();
		        	addcart.setVisible(false);
		        	addcart.dispose();
		        }
		    });
		    
		    
		    
		    make.add(item4);
		    item4.setOpaque(true);
		    item4.setBackground(Color.WHITE);
		    item4.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent ev) {
		        	new popularimages();
		        	addcart.setVisible(false);
		        	addcart.dispose();
		        }
		});  
		    menuBar.add(make);
		     menuBar.setBounds(670,100,220,28);
		     menuBar.setBackground(Color.WHITE);
		     addcart.add(menuBar);
		     
		     AU.setBounds(30,150,200,50);
		     AU.setForeground(Color.WHITE);
		     AU.setFont(new Font("AR BONNIE", Font.BOLD, 55));
		     addcart.add(AU);
		     abt.setBounds(680,140,680,620);
			    ImageIcon aboutus = new ImageIcon("res/AboutUs.png");
			    abt.setIcon(aboutus);
			    addcart.add(abt);
			    
		    

		        
				    addcart.add(b1);
				    addcart.add(b2);
				    addcart.add(b3);
				//    addcart.add(b4);
				    addcart.add(b5);
				   addcart.add(b6);
				   
				   addcart.add(min);
				    
				    addcart.add(close);
				    addcart.add(Aboutbackground);
				    addcart.add(l);
				    
				    
				    
				    
				   
				    
				    
				   
					addcart.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

					  

				    addcart.setSize(1366,768);
				    addcart.setUndecorated(true);
				    addcart.setVisible(true);
		
	    
	    
	    
	    
	}
	
	

}
