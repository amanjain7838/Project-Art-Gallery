package artgallery;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;




public class Payment extends variabledecl implements ActionListener{
	
	

	
	


	public Payment() {
		
		
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
	    mainlogo.setFont(new Font("AC CENA", Font.BOLD, 45));
	    mainlogo.setForeground(Color.WHITE);
	    mainlogo.setBounds(10, 10, 300, 90);
	    paymentframe.add(mainlogo);
	    JLabel tagline = new JLabel("       Paint the world");
	    tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
	    tagline.setForeground(Color.WHITE);
	    tagline.setBounds(15, 40, 300, 90);
	    paymentframe.add(tagline);
	    
	    background.setBounds(0,110,1366,700);
	    ImageIcon backgd = new ImageIcon("res/def.jpg");
	    background.setIcon(backgd);
	    
	  
	    cp.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	      new HomePage();
	      paymentframe.setVisible(false);
	      paymentframe.dispose();
	        }
	    });

	      

	    b1.setBounds(10,100,220,28);
	    b1.setBackground(Color.WHITE);
	    b1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	      	  
	      	new HomePage();
	      	paymentframe.setVisible(false);
	      	paymentframe.dispose();
	      	 
	      	  
	        }
	    });
	    
	        
	    b2.setBounds(230,100,220,28);
	    b2.setBackground(Color.WHITE);
	    b2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	      	  
	      	new UpSign();
	      	paymentframe.setVisible(false);
	      	paymentframe.dispose();
	      	 
	      	  
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
	      	paymentframe.setVisible(false);
	      	paymentframe.dispose();
	      	 
	      	  
	        }
	    });
	    
	  b6.setBounds(1100,100,220,28);
	   b6.setBackground(Color.WHITE);
	   b6.addActionListener(new ActionListener() {
	       public void actionPerformed(ActionEvent ev) {
	     	  
	     	new ContactUs();
	     	paymentframe.setVisible(false);
	     	paymentframe.dispose();
	     	 
	     	  
	       }
	   });    
	   
	 //item1 
	   make.add(item1);
	  item1.setOpaque(true);
	  item1.setBackground(Color.WHITE);
	  item1.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ev) {
	      	new popularimages();
	         	paymentframe.setVisible(false);
	         	paymentframe.dispose();
	      }
	  });
	  
	  //item2
	  
	  make.add(item2);
	  item2.setOpaque(true);
	  item2.setBackground(Color.WHITE);
	  item2.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ev) {
	      	new popularimages();
	         	paymentframe.setVisible(false);
	         	paymentframe.dispose();
	      }
	  });
	  
	  
	  
	  make.add(item3);
	  item3.setOpaque(true);
	  item3.setBackground(Color.WHITE);
	  item3.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ev) {
	      	new popularimages();
	         	paymentframe.setVisible(false);
	         	paymentframe.dispose();
	      }
	  });
	  
	  
	  
	  make.add(item4);
	  item4.setOpaque(true);
	  item4.setBackground(Color.WHITE);
	  item4.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ev) {
	      	new popularimages();
	         	paymentframe.setVisible(false);
	         	paymentframe.dispose();
	      }
	});     
	   	   
	     menuBar.add(make);
	     menuBar.setBounds(670,100,220,28);
	     menuBar.setBackground(Color.WHITE);
	     paymentframe.add(menuBar);
	    

	        
			    paymentframe.add(b1);
			    paymentframe.add(b2);
			    paymentframe.add(b3);
			//    paymentframe.add(b4);
			    paymentframe.add(b5);
			   paymentframe.add(b6);
			   
			   
			   
			   
			   pay.setBounds(10,150,200,30);  
			   pay.setFont(new Font("Comic Sans",Font.BOLD,20));
			    paymentframe.add(pay);
			    
			    card.setBounds(280,150,250,50);
			    ImageIcon cardicon = new ImageIcon("res/card.png");
			    card.setIcon(cardicon);
			    paymentframe.add(card);
			    
			    cardNo.setBounds(10,210,150,20);
			    paymentframe.add(cardNo);
			    Tcard.setBounds(10,240,180,30);
			    paymentframe.add(Tcard);
			    
			    name.setBounds(300,210,150,20);
			    paymentframe.add(name);
			    Tname.setBounds(300,240,180,30);
			    paymentframe.add(Tname);
			    
			    type.setBounds(10,280,150,20);
			    paymentframe.add(type);
			    Ttype.setBounds(10,310,180,30);
			    paymentframe.add(Ttype);
			    
			    expire.setBounds(300,285,150,20);
			    paymentframe.add(expire);
			    
			    month.setBounds(300,310,90,25);
			    paymentframe.add(month);
			    
			    year.setBounds(400,310,90,25);
			    paymentframe.add(year);
			    
			    cvv.setBounds(10,350,150,20);
			    paymentframe.add(cvv);
			    Tcvv.setBounds(10,380,180,30);
			    paymentframe.add(Tcvv);
			    
			    paid.setBounds(10,420,150,20);
			    paymentframe.add(paid);
			    Tamt.setBounds(10,450,180,30);
			    
			    Tamt.setEnabled(false);
			    Tamt.setFont(new Font("AC CENA", Font.BOLD, 30));
			    Tamt.setBackground(Color.BLACK);
			    Tamt.setText(temp.temp+"");
			    paymentframe.add(Tamt);
			    
			    
			    mp.setBounds(10,585,120,25);
			    cp.setBounds(150,585,130,25);
			    
			    mp.addActionListener(this);
			    paymentframe.add(mp);
			    paymentframe.add(cp);
			    
			    artwork1.setBounds(650,200,200,200);
			    ImageIcon a1 = new ImageIcon("res/art1.jpg");
			    artwork1.setIcon(a1);
			    
			    artwork2.setBounds(870,210,270,170);
			    ImageIcon a2 = new ImageIcon("res/art2.jpg");
			    artwork2.setIcon(a2);
			    
			    artwork3.setBounds(650,420,300,170);
			    ImageIcon a3 = new ImageIcon("res/wallart2.jpg");
			    artwork3.setIcon(a3);
			    
			    artwork4.setBounds(960,400,180,190);
			    ImageIcon a4 = new ImageIcon("res/wallart3.jpg");
			    artwork4.setIcon(a4);
			    
			    //paymentframe.add(artwork1);
			   // paymentframe.add(artwork2);
			    //paymentframe.add(artwork3);
			   // paymentframe.add(artwork4);
			    
			   
			    
			    
			    
			   
			   paymentframe.add(min);
			    
			    paymentframe.add(close); 
				paymentframe.add(background);
				paymentframe.add(l);
			    
			   
			    
			    
			    
				paymentframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

				  

			    paymentframe.setSize(1366,768);
			    paymentframe.setUndecorated(true);
			    paymentframe.setVisible(true);
			    



}
	
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == mp) {
			if(Tcard.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"Enter the correct Detaisl");
			}
	
			else {
			JOptionPane.showMessageDialog(null,"Congratulations your order has been confirmed.");
			System.exit(0);
		}}
		
		if(e.getSource()==close)
		{System.exit(0);}
		else if(e.getSource()==min)
	{paymentframe.setState(JFrame.ICONIFIED); }

		}
}

	

