package artgallery;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.*;

public class popularimages extends popularvariable implements ActionListener {
    
	popularimages()
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
    popf.add(mainlogo);
    JLabel tagline = new JLabel("       Paint the world");
    tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
    tagline.setForeground(Color.WHITE);
    tagline.setBounds(15, 40, 300, 90);
    popf.add(tagline);
  
      
      
    b1.setBounds(10,100,220,28);
    b1.setBackground(Color.WHITE);
    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
      	  
      	new HomePage();
      	popf.setVisible(false);
      	popf.dispose();
      	 
      	  
        }
    });
    
        
    b2.setBounds(230,100,220,28);
    b2.setBackground(Color.WHITE);
    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
      	  
      	new UpSign();
      	popf.setVisible(false);
      	popf.dispose();
      	 
      	  
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
      	popf.setVisible(false);
      	popf.dispose();
      	 
      	  
        }
    });
    
  b6.setBounds(1100,100,220,28);
   b6.setBackground(Color.WHITE);
   b6.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ev) {
     	  
     	new ContactUs();
     	popf.setVisible(false);
     	popf.dispose();
     	 
     	  
       }
   });    
   
 //item1 
   make.add(item1);
  item1.setOpaque(true);
  item1.setBackground(Color.WHITE);
  item1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
      }
  });
  
  //item2
  
  make.add(item2);
  item2.setOpaque(true);
  item2.setBackground(Color.WHITE);
  item2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
      	modernart();}
  });
  
  
  
  make.add(item3);
  item3.setOpaque(true);
  item3.setBackground(Color.WHITE);
  item3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
      abstractart();}
  });
  
  
  
  make.add(item4);
  item4.setOpaque(true);
  item4.setBackground(Color.WHITE);
  item4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
      sceneryart();}
});     
     
     
   
     menuBar.add(make);
     menuBar.setBounds(670,100,220,28);
     menuBar.setBackground(Color.WHITE);
     popf.add(menuBar);
     
     
    JLabel frameback = new JLabel();
    frameback.setBounds(0, 110, 1365, 700);
    ImageIcon backgr = new ImageIcon("res/back.png");
    frameback.setIcon(backgr);
    
    popf.add(b1);
    popf.add(b2);
    popf.add(b3);
		//    f.add(b4);
    popf.add(b5);
    popf.add(b6);
	

		  /* right.setIcon(new ImageIcon("res/popright1.jpg"));
	       right.setBounds(1200,130,160,660);	    
    f.add(right);*/
    
    //images to display
    
    poppi1.setIcon(new ImageIcon("res/pi1.jpg"));
    poppi1.setBounds(30, 140, 140, 175);
    popf.add(poppi1);
     
     
                                  ///DATABASE 
    poppi1name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
    poppi1name.setForeground(Color.BLACK);
    poppi1name.setBounds(180, 75, 200, 200);
    popf.add(poppi1name);
     
     
    poppi1price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi1price.setForeground(Color.BLACK);
     poppi1price.setBounds(180, 220, 200,50);
     popf.add(poppi1price);                                                     //DATABASE
     
     
     poppi1buy.setBounds(180, 255, 130, 40);
     
     poppi1buy.setOpaque(false);
     popf.add(poppi1buy);
     poppi1buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	if(poppi1buy.isSelected()==true)
        	 popprice+=Integer.parseInt(poppi1price.getText());
        	else if(poppi1buy.isSelected()==false)
           	 popprice-=Integer.parseInt(poppi1price.getText());
           
        	amountincrease();
         }
     });
    
     
     
     
     
     poppi2.setIcon(new ImageIcon("res/pi2.jpg"));
     poppi2.setBounds(330, 140, 140, 175);
     popf.add(poppi2);
                                     ///DATABASE 
     poppi2name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi2name.setForeground(Color.BLACK);
     poppi2name.setBounds(480, 75, 200, 200);
     popf.add(poppi2name);
     
      poppi2price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
      poppi2price.setForeground(Color.BLACK);
      poppi2price.setBounds(480, 220, 200,50);
      popf.add(poppi2price);                                                     //DATABASE
     
     
     poppi2buy.setBounds(480, 255, 130, 40);

     poppi2buy.setOpaque(false);
      
     popf.add(poppi2buy);
     poppi2buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi2buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi2price.getText());
        	 else	if(poppi2buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi2price.getText());
                amountincrease();
        	 }
     });
     
     
     poppi3.setIcon(new ImageIcon("res/pi3.jpg"));
     poppi3.setBounds(630, 140, 140, 175);
     popf.add(poppi3);
                                     ///DATABASE 
     poppi3name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi3name.setForeground(Color.BLACK);
     poppi3name.setBounds(780, 75, 200, 200);
     popf.add(poppi3name);
     
     poppi3price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi3price.setForeground(Color.BLACK);
     poppi3price.setBounds(780,220, 200,50);
     popf.add(poppi3price);                                                     //DATABASE
     
     
     poppi3buy.setBounds(780, 255, 130, 40);

     poppi3buy.setOpaque(false);
      
     popf.add(poppi3buy);
     poppi3buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi3buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi3price.getText());
        	 else	if(poppi3buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi3price.getText());
               amountincrease();
        	 }
     });
     
     
     poppi4.setIcon(new ImageIcon("res/pi4.jpg"));
     poppi4.setBounds(930, 140, 140, 175);
     popf.add(poppi4);
                                     ///DATABASE 
     poppi4name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi4name.setForeground(Color.BLACK);
     poppi4name.setBounds(1080, 75, 200, 200);
     popf.add(poppi4name);
     
      poppi4price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
      poppi4price.setForeground(Color.BLACK);
      poppi4price.setBounds(1080,220, 200,50);
      popf.add(poppi4price);                                                     //DATABASE
     
     
     poppi4buy.setBounds(1080, 255, 130, 40);
     poppi4buy.setOpaque(false);
     
     popf.add(poppi4buy);
     poppi4buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi4buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi4price.getText());
        	 else	if(poppi4buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi4price.getText());
               amountincrease();
         }
     });
     
     poppi5.setIcon(new ImageIcon("res/pi5.jpg"));
     poppi5.setBounds(30, 365, 140, 175);
     popf.add(poppi5);
                                    ///DATABASE 
     poppi5name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi5name.setForeground(Color.BLACK);
     poppi5name.setBounds(180, 305, 200, 200);
     popf.add(poppi5name);
     
     poppi5price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi5price.setForeground(Color.BLACK);
     poppi5price.setBounds(180,455, 200, 40);
     popf.add(poppi5price);                                                     //DATABASE
     
     
     poppi5buy.setBounds(180, 490, 130, 40);
     poppi5buy.setOpaque(false);
     
     popf.add(poppi5buy);
     poppi5buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi5buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi5price.getText());
        	 else	if(poppi5buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi5price.getText());
                      	 amountincrease();
         }
     });
     
     poppi6.setIcon(new ImageIcon("res/pi6.jpg"));
     poppi6.setBounds(330, 365, 140, 175);
     popf.add(poppi6);
                                     ///DATABASE 
     poppi6name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi6name.setForeground(Color.BLACK);
     poppi6name.setBounds(480, 295, 200, 200);
     popf.add(poppi6name);
     
     poppi6price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi6price.setForeground(Color.BLACK);
     poppi6price.setBounds(480,455, 200, 40);
     popf.add(poppi6price);                                                     //DATABASE
     
     
     poppi6buy.setBounds(480, 490, 130, 40);
     poppi6buy.setOpaque(false);
     popf.add(poppi6buy);
     poppi6buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi6buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi6price.getText());
        	 else	if(poppi6buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi6price.getText());
               amountincrease();
         }
     });
     
     
     poppi7.setIcon(new ImageIcon("res/pi7.jpg"));
     poppi7.setBounds(630, 365, 140, 175);
     popf.add(poppi7);
                                    ///DATABASE 
     poppi7name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi7name.setForeground(Color.BLACK);
     poppi7name.setBounds(780, 295, 200, 200);
      popf.add(poppi7name);
     
     poppi7price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi7price.setForeground(Color.BLACK);
     poppi7price.setBounds(780,455, 200, 40);
     popf.add(poppi7price);                                                     //DATABASE
     
     
     poppi7buy.setBounds(780, 490, 130, 40);
     poppi7buy.setOpaque(false);
     popf.add(poppi7buy);
     poppi7buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi7buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi7price.getText());
        	 else	if(poppi7buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi7price.getText());
               amountincrease();
         }
     });
     
     
     poppi8.setIcon(new ImageIcon("res/pi8.jpg"));
     poppi8.setBounds(930, 365, 140, 175);
     popf.add(poppi8);
                                     ///DATABASE 
     poppi8name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi8name.setForeground(Color.BLACK);
     poppi8name.setBounds(1080, 295, 200, 200);
      popf.add(poppi8name);
     
     poppi8price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi8price.setForeground(Color.BLACK);
     poppi8price.setBounds(1080,455, 200, 40);
     popf.add(poppi8price);                                                     //DATABASE
     
     
     poppi8buy.setBounds(1080, 490, 130, 40);
     poppi8buy.setOpaque(false);
     popf.add(poppi8buy);
     poppi8buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi8buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi8price.getText());
        	 else	if(poppi8buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi8price.getText());
              	 amountincrease();
         }
     });
     
     
     poppi9.setIcon(new ImageIcon("res/pi9.jpg"));
     poppi9.setBounds(30, 590, 140, 175);
     popf.add(poppi9);
                                     ///DATABASE 
     poppi9name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi9name.setForeground(Color.BLACK);
     poppi9name.setBounds(180, 520, 200, 200);
     popf.add(poppi9name);
     
     poppi9price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi9price.setForeground(Color.BLACK);
     poppi9price.setBounds(180,675, 200,40);
     popf.add(poppi9price);                                                     //DATABASE
     
     
     poppi9buy.setBounds(180, 710, 130, 40);
     poppi9buy.setOpaque(false);
     popf.add(poppi9buy);
     poppi9buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi9buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi9price.getText());
        	 else	if(poppi9buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi9price.getText());
               amountincrease();
         }
     });
     
     poppi10.setIcon(new ImageIcon("res/pi10.jpg"));
     poppi10.setBounds(330, 590, 140, 175);
     popf.add(poppi10);
                                     ///DATABASE 
     poppi10name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi10name.setForeground(Color.BLACK);
     poppi10name.setBounds(480, 520, 200, 200);
     popf.add(poppi10name);
     
     poppi10price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi10price.setForeground(Color.BLACK);
     poppi10price.setBounds(480,675, 200,40);
     popf.add(poppi10price);                                                     //DATABASE
     
     
     poppi10buy.setBounds(480, 710, 130, 40);
     poppi10buy.setOpaque(false);
     popf.add(poppi10buy);
     poppi10buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi10buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi10price.getText());
        	 else	if(poppi10buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi10price.getText());
              	 amountincrease();
         }
     });
     
     
     poppi11.setIcon(new ImageIcon("res/pi11.jpg"));
     poppi11.setBounds(630, 590, 140, 175);
     popf.add(poppi11);
     
                                     ///DATABASE 
     poppi11name.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi11name.setForeground(Color.BLACK);
     poppi11name.setBounds(780, 520, 200, 200);
     popf.add(poppi11name);
     
     poppi11price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 22));
     poppi11price.setForeground(Color.BLACK);
     poppi11price.setBounds(780,675, 200,40);
     popf.add(poppi11price);                                                     //DATABASE
     
     poppi11buy.setBounds(780, 710, 130, 40);
     poppi11buy.setOpaque(false);
     
     popf.add(poppi11buy);
     poppi11buy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
        	 if(poppi11buy.isSelected()==true)
            	 popprice+=Integer.parseInt(poppi11price.getText());
        	 else	if(poppi11buy.isSelected()==false)
               	 popprice-=Integer.parseInt(poppi11price.getText());
              amountincrease();
         }
     });
         
     poptotal.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 35));

     poptotal.setBounds(950,550,300,135);
     popf.add(poptotal);
     poppi12price.setFont(new Font("Bradley Hand ITC TT", Font.PLAIN, 35));
     poppi12price.setBounds(1010,650,200,35);
     popbuybutton.setBounds(1000,700, 130, 40);
     popbuybutton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
      	  temp.change(popprice);
      	new address();
      	popf.setVisible(false);
      	popf.dispose();
      	 
      	  
        }
    });
   
    ImageIcon buy = new ImageIcon("res/buycart.png");
    popbuybutton.setIcon(buy);
    popf.add(poppi12price);
    popf.add(popbuybutton);
    
    
    
    popf.add(frameback);

    
    
    //adding frame
   
    popf.add(min);
    
    popf.add(close); popf.add(l);
    
    
    
    popf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	  

    popf.setSize(1366,768);
    popf.setUndecorated(true);
    popf.setVisible(true);
    
    
	
	
	
}
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{if(e.getSource()==close)
		{System.exit(0);}
	else if(e.getSource()==min)
	{popf.setState(JFrame.ICONIFIED);
	}	
	}
		
	public static void amountincrease()
	{poptotal.setText("Amount to pay");
	poppi12price.setText(popprice+"");
	}
		
	public static void clearlabel()
	{
		poppi1.setVisible(false);
		poppi1name.setVisible(false);
		poppi1price.setVisible(false);
		poppi1buy.setVisible(false);
		 
		poppi2.setVisible(false);
		poppi2name.setVisible(false);
		poppi2price.setVisible(false);
		poppi2buy.setVisible(false);
				
		poppi3.setVisible(false);
		poppi3name.setVisible(false);
		poppi3price.setVisible(false);
		poppi3buy.setVisible(false);
			
		poppi4.setVisible(false);
		poppi4name.setVisible(false);
		poppi4price.setVisible(false);
		poppi4buy.setVisible(false);
			
		   
		poppi5.setVisible(false);
		poppi5name.setVisible(false);
		poppi5price.setVisible(false);
		poppi5buy.setVisible(false);
			
		poppi6.setVisible(false);
		poppi6name.setVisible(false);
		poppi6price.setVisible(false);
		poppi6buy.setVisible(false);
			
		poppi7.setVisible(false);
		poppi7name.setVisible(false);
		poppi7price.setVisible(false);
		poppi7buy.setVisible(false);
			
		poppi8.setVisible(false);
		poppi8name.setVisible(false);
		poppi8price.setVisible(false);
		poppi8buy.setVisible(false);
			
		poppi9.setVisible(false);
		poppi9name.setVisible(false);
		poppi9price.setVisible(false);
		poppi9buy.setVisible(false);
			
		poppi10.setVisible(false);
		poppi10name.setVisible(false);
		poppi10price.setVisible(false);
		poppi10buy.setVisible(false);
			
		poppi11.setVisible(false);
		poppi11name.setVisible(false);
		poppi11price.setVisible(false);
		poppi11buy.setVisible(false);
	}

	public static void modernart()
	{		
		   clearlabel();
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","artdetails","tiger");  
			      
			PreparedStatement ps=con.prepareStatement("select * from modern_art");  
			ResultSet rs=ps.executeQuery();  
			
			
			
			int i=0;
			while(rs.next()&&i<=11){//now on 1st row  
			    
				String name=rs.getString(2);
				int price=rs.getInt(3);        
			Blob b=rs.getBlob(4);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			   if(i==0)           
			
			   {poppi1.setVisible(true);
			   poppi1name.setVisible(true);
			   poppi1price.setVisible(true);
			   poppi1buy.setVisible(true);
				
				   
				   
			   poppi1.setIcon(new ImageIcon(barr));              
			   poppi1price.setText(Integer.toString(price));
			   poppi1name.setText(name);
			}
			   else if(i==1)
			   {poppi2.setVisible(true);
			   poppi2name.setVisible(true);
			   poppi2price.setVisible(true);
			   poppi2buy.setVisible(true);
				
				   
				   
			   poppi2.setIcon(new ImageIcon(barr));    
			   poppi2price.setText(Integer.toString(price));
			   poppi2name.setText(name);
			   }
			   else if(i==2)
			   {poppi3.setVisible(true);
			   poppi3name.setVisible(true);
			   poppi3price.setVisible(true);
			   poppi3buy.setVisible(true);
				
				   
			   poppi3.setIcon(new ImageIcon(barr));    
			   poppi3price.setText(Integer.toString(price));
			   poppi3name.setText(name);
			   }
			   else if(i==3)
			   {poppi4.setVisible(true);
			   poppi4name.setVisible(true);
			   poppi4price.setVisible(true);
			   poppi4buy.setVisible(true);
				
				   
				   
				   
			   poppi4.setIcon(new ImageIcon(barr));    
			   poppi4price.setText(Integer.toString(price));
			   poppi4name.setText(name);
			   }
			   else if(i==4)
				   {poppi5.setVisible(true);
				   poppi5name.setVisible(true);
				   poppi5price.setVisible(true);
				   poppi5buy.setVisible(true);
				
				   
				   
				   
				   poppi5.setIcon(new ImageIcon(barr));    
				   poppi5price.setText(Integer.toString(price));
				   poppi5name.setText(name);
			   }
			   else if(i==5)
			   {poppi6.setVisible(true);
			   poppi6name.setVisible(true);
			   poppi6price.setVisible(true);
			   poppi6buy.setVisible(true);
				
				   
				   
			   poppi6.setIcon(new ImageIcon(barr));    
			   poppi6price.setText(Integer.toString(price));
			   poppi6name.setText(name);
			   }
			   else if(i==6)
			   {poppi7.setVisible(true);
			   poppi7name.setVisible(true);
			   poppi7price.setVisible(true);
			   poppi7buy.setVisible(true);
				
				   
				   
			   poppi7.setIcon(new ImageIcon(barr));    
			   poppi7price.setText(Integer.toString(price));
			   poppi7name.setText(name);
			   }
			   else if(i==7)
			   {poppi8.setVisible(true);
			   poppi8name.setVisible(true);
			   poppi8price.setVisible(true);
			   poppi8buy.setVisible(true);
				
			   poppi8.setIcon(new ImageIcon(barr));    
			   poppi8price.setText(Integer.toString(price));
			   poppi8name.setText(name);
			   }
			   else if(i==8)
			   { poppi9.setVisible(true);
			   poppi9name.setVisible(true);
			   poppi9price.setVisible(true);
			   poppi9buy.setVisible(true);
				
				   
				   
				   
			   poppi9.setIcon(new ImageIcon(barr));    
			   poppi9price.setText(Integer.toString(price));
			   poppi9name.setText(name);
			   }
			   else if(i==9)
			   {poppi10.setVisible(true);
			   poppi10name.setVisible(true);
			   poppi10price.setVisible(true);
			   poppi10buy.setVisible(true);
				
				   
				   
			   poppi10.setIcon(new ImageIcon(barr));    
			   poppi10price.setText(Integer.toString(price));
			   poppi10name.setText(name);
			   }
			   else if(i==10)
			   {poppi11.setVisible(true);
			   poppi11name.setVisible(true);
			   poppi11price.setVisible(true);
			   poppi11buy.setVisible(true);
				   
				   
				   
			   poppi11.setIcon(new ImageIcon(barr));    
			   poppi11price.setText(Integer.toString(price));
			   poppi11name.setText(name);
			   }
			   
			   
			   
			   
			   
			   i++;
			}con.close();  
			}catch (Exception e) {e.printStackTrace();  }  
}

	
	


	public static void abstractart()
	{clearlabel();		
		   
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","artdetails","tiger");  
			      
			PreparedStatement ps=con.prepareStatement("select * from abstract_art");  
			ResultSet rs=ps.executeQuery();  
			
			
			
			int i=0;
			while(rs.next()&&i<=11){//now on 1st row  
			    
				String name=rs.getString(2);
				int price=rs.getInt(3);        
			Blob b=rs.getBlob(4);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			   if(i==0)           
			
			   {poppi1.setVisible(true);
			   poppi1name.setVisible(true);
			   poppi1price.setVisible(true);
			   poppi1buy.setVisible(true);
				
				   
				   
			   poppi1.setIcon(new ImageIcon(barr));              
			   poppi1price.setText(Integer.toString(price));
			   poppi1name.setText(name);
			}
			   else if(i==1)
			   {poppi2.setVisible(true);
			   poppi2name.setVisible(true);
			   poppi2price.setVisible(true);
			   poppi2buy.setVisible(true);
				
				   
				   
			   poppi2.setIcon(new ImageIcon(barr));    
			   poppi2price.setText(Integer.toString(price));
			   poppi2name.setText(name);
			   }
			   else if(i==2)
			   {poppi3.setVisible(true);
			   poppi3name.setVisible(true);
			   poppi3price.setVisible(true);
			   poppi3buy.setVisible(true);
				
				   
			   poppi3.setIcon(new ImageIcon(barr));    
			   poppi3price.setText(Integer.toString(price));
			   poppi3name.setText(name);
			   }
			   else if(i==3)
			   {poppi4.setVisible(true);
			   poppi4name.setVisible(true);
			   poppi4price.setVisible(true);
			   poppi4buy.setVisible(true);
				
				   
				   
				   
			   poppi4.setIcon(new ImageIcon(barr));    
			   poppi4price.setText(Integer.toString(price));
			   poppi4name.setText(name);
			   }
			   else if(i==4)
			   {poppi5.setVisible(true);
			   poppi5name.setVisible(true);
			   poppi5price.setVisible(true);
			   poppi5buy.setVisible(true);
				
				   
				   
				   
				   poppi5.setIcon(new ImageIcon(barr));    
			   poppi5price.setText(Integer.toString(price));
			   poppi5name.setText(name);
			   }
			   else if(i==5)
			   {poppi6.setVisible(true);
			   poppi6name.setVisible(true);
			   poppi6price.setVisible(true);
			   poppi6buy.setVisible(true);
				
				   
				   
				   poppi6.setIcon(new ImageIcon(barr));    
			   poppi6price.setText(Integer.toString(price));
			   poppi6name.setText(name);
			   }
			   else if(i==6)
			   {poppi7.setVisible(true);
			   poppi7name.setVisible(true);
			   poppi7price.setVisible(true);
			   poppi7buy.setVisible(true);
				
				   
				   
				   poppi7.setIcon(new ImageIcon(barr));    
			   poppi7price.setText(Integer.toString(price));
			   poppi7name.setText(name);
			   }
			   else if(i==7)
			   {poppi8.setVisible(true);
			   poppi8name.setVisible(true);
			   poppi8price.setVisible(true);
			   poppi8buy.setVisible(true);
				
				   poppi8.setIcon(new ImageIcon(barr));    
			   poppi8price.setText(Integer.toString(price));
			   poppi8name.setText(name);
			   }
			   else if(i==8)
			   { poppi9.setVisible(true);
			   poppi9name.setVisible(true);
			   poppi9price.setVisible(true);
			   poppi9buy.setVisible(true);
				
				   
				   
				   
				   poppi9.setIcon(new ImageIcon(barr));    
			   poppi9price.setText(Integer.toString(price));
			   poppi9name.setText(name);
			   }
			   else if(i==9)
			   {poppi10.setVisible(true);
			   poppi10name.setVisible(true);
			   poppi10price.setVisible(true);
			   poppi10buy.setVisible(true);
				
				   
				   
				   poppi10.setIcon(new ImageIcon(barr));    
			   poppi10price.setText(Integer.toString(price));
			   poppi10name.setText(name);
			   }
			   else if(i==10)
			   {poppi11.setVisible(true);
			   poppi11name.setVisible(true);
			   poppi11price.setVisible(true);
			   poppi11buy.setVisible(true);
				   
				   
				   
				   poppi11.setIcon(new ImageIcon(barr));    
			   poppi11price.setText(Integer.toString(price));
			   poppi11name.setText(name);
			   }
			   
			   
			   
			   
			   
			   i++;
			}con.close();  
			}catch (Exception e) {e.printStackTrace();  }  
}

	public static void sceneryart()
	{clearlabel();	   
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","artdetails","tiger");  
			      
			PreparedStatement ps=con.prepareStatement("select * from scenery_art");  
			ResultSet rs=ps.executeQuery();  
			
			
			
			int i=0;
			while(rs.next()&&i<=11){//now on 1st row  
			    
				String name=rs.getString(2);
				int price=rs.getInt(3);        
			Blob b=rs.getBlob(4);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			   if(i==0)           
			
			   {poppi1.setVisible(true);
			   poppi1name.setVisible(true);
			   poppi1price.setVisible(true);
			   poppi1buy.setVisible(true);
				
				   
				   
				   poppi1.setIcon(new ImageIcon(barr));              
			poppi1price.setText(Integer.toString(price));
			poppi1name.setText(name);
			}
			   else if(i==1)
			   {poppi2.setVisible(true);
			   poppi2name.setVisible(true);
			   poppi2price.setVisible(true);
			   poppi2buy.setVisible(true);
				
				   
				   
				   poppi2.setIcon(new ImageIcon(barr));    
			   poppi2price.setText(Integer.toString(price));
			   poppi2name.setText(name);
			   }
			   else if(i==2)
			   {poppi3.setVisible(true);
			   poppi3name.setVisible(true);
			   poppi3price.setVisible(true);
			   poppi3buy.setVisible(true);
				
				   
				   poppi3.setIcon(new ImageIcon(barr));    
			   poppi3price.setText(Integer.toString(price));
			   poppi3name.setText(name);
			   }
			   else if(i==3)
			   {poppi4.setVisible(true);
			   poppi4name.setVisible(true);
			   poppi4price.setVisible(true);
			   poppi4buy.setVisible(true);
				
				   
				   
				   
				   poppi4.setIcon(new ImageIcon(barr));    
			   poppi4price.setText(Integer.toString(price));
			   poppi4name.setText(name);
			   }
			   else if(i==4)
			   {poppi5.setVisible(true);
			   poppi5name.setVisible(true);
			   poppi5price.setVisible(true);
			   poppi5buy.setVisible(true);
				
				   
				   
				   
				   poppi5.setIcon(new ImageIcon(barr));    
			   poppi5price.setText(Integer.toString(price));
			   poppi5name.setText(name);
			   }
			   else if(i==5)
			   {poppi6.setVisible(true);
			   poppi6name.setVisible(true);
			   poppi6price.setVisible(true);
			   poppi6buy.setVisible(true);
				
				   
				   
				   poppi6.setIcon(new ImageIcon(barr));    
			   poppi6price.setText(Integer.toString(price));
			   poppi6name.setText(name);
			   }
			   else if(i==6)
			   {poppi7.setVisible(true);
			   poppi7name.setVisible(true);
			   poppi7price.setVisible(true);
			   poppi7buy.setVisible(true);
				
				   
				   
				   poppi7.setIcon(new ImageIcon(barr));    
			   poppi7price.setText(Integer.toString(price));
			   poppi7name.setText(name);
			   }
			   else if(i==7)
			   {poppi8.setVisible(true);
			   poppi8name.setVisible(true);
			   poppi8price.setVisible(true);
			   poppi8buy.setVisible(true);
				
				   poppi8.setIcon(new ImageIcon(barr));    
			   poppi8price.setText(Integer.toString(price));
			   poppi8name.setText(name);
			   }
			   else if(i==8)
			   { poppi9.setVisible(true);
			   poppi9name.setVisible(true);
			   poppi9price.setVisible(true);
			   poppi9buy.setVisible(true);
				
				   
				   
				   
				   poppi9.setIcon(new ImageIcon(barr));    
			   poppi9price.setText(Integer.toString(price));
			   poppi9name.setText(name);
			   }
			   else if(i==9)
			   {poppi10.setVisible(true);
			   poppi10name.setVisible(true);
			   poppi10price.setVisible(true);
			   poppi10buy.setVisible(true);
				
				   
				   
				   poppi10.setIcon(new ImageIcon(barr));    
			   poppi10price.setText(Integer.toString(price));
			   poppi10name.setText(name);
			   }
			   else if(i==10)
			   {poppi11.setVisible(true);
			   poppi11name.setVisible(true);
			   poppi11price.setVisible(true);
			   poppi11buy.setVisible(true);
				   
				   
				   
				   poppi11.setIcon(new ImageIcon(barr));    
			   poppi11price.setText(Integer.toString(price));
			   poppi11name.setText(name);
			   }
			   
			   
			   
			   
			   
			   i++;
			}con.close();  
			}catch (Exception e) {e.printStackTrace();  }  
}

	
	
	

}
