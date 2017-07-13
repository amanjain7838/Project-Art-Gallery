package artgallery;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class HomePage  {
		
		
	/*
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == rightimagebutton) {
		ImageIcon fr = new ImageIcon("res/forwardclick.png");
		   rightimagebutton.setIcon(fr);
		}
		
		else if(e.getSource() == leftimagebutton) {
			ImageIcon bk = new ImageIcon("res/backwardclicked.png");
		    leftimagebutton.setIcon(bk);
		}
		   
		   
		   
		
	}


	
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == rightimagebutton) {
			ImageIcon fr = new ImageIcon("res/forwardnotclick.png");
			   rightimagebutton.setIcon(fr);
			}
			
			else if(e.getSource() == leftimagebutton) {
				ImageIcon bk = new ImageIcon("res/backwardnotclick.png");
			    leftimagebutton.setIcon(bk);
			}}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}	*/
	
HomePage()
{		//int count=0;


		JLabel l=new JLabel();
		JButton close=new JButton();
		JButton min=new JButton();

		JFrame homeframe=new JFrame();
		JPanel p = new JPanel();
		JButton b1 = new JButton("Home");
		JButton b2 = new JButton("Register");
		JButton b3 = new JButton("Login");
		//JButton b4 = new JButton("Home");
		JButton b5 = new JButton("About Us");
		JButton b6 = new JButton("Contact");

		JMenuBar menuBar = new JMenuBar();
	    JMenu make = new JMenu("Genre                                                             ");
	    JMenuItem item1 = new JMenuItem("Popular Artwork                                           ");
	    JMenuItem item2 = new JMenuItem("Modern Art");		   
	    JMenuItem item3 = new JMenuItem("Abstract Art");
	    JMenuItem item4 = new JMenuItem("Scenery Art");
	    
		JPanel p2 = new JPanel();
	    JLabel scrollimage = new JLabel();

	   
	    JLabel leftsideimage= new JLabel();
	    JLabel rightsideimage= new JLabel();
	     
	    JButton leftimagebutton=new JButton();
	    JButton rightimagebutton=new JButton();
	    
	    JButton i1b = new JButton();
	    JButton i2b = new JButton();
	    JButton i3b = new JButton();
	    JButton i4b = new JButton();
	    JButton i5b = new JButton();
	    JButton i6b = new JButton();
	    JLabel i1l1 = new JLabel("Name : Cold Fox");
	    JLabel i1l2 =  new JLabel("Artist : John Snow");
	    JLabel i1l3 = new JLabel ("Material: Oil Painting");
	    JLabel i2l = new JLabel();
	    JLabel i2l1 = new JLabel("Name : The Ship");
	    JLabel i2l2 =  new JLabel("Artist : Johny Depp");
	    JLabel i2l3 = new JLabel ("Material: Gray Scale");
	    JLabel i3l = new JLabel();
	    JLabel i3l1 = new JLabel("Name : Rain Coat");
	    JLabel i3l2 =  new JLabel("Artist : Monica");
	    JLabel i3l3 = new JLabel ("Material: Oil Paint");
	    JLabel i4l = new JLabel();
	    JLabel i4l1 = new JLabel("Name : Butterfly");
	    JLabel i4l2 =  new JLabel("Artist : Donna");
	    JLabel i4l3 = new JLabel ("Material: Water Color");
	    JLabel i5l = new JLabel();
	    JLabel i5l1 = new JLabel("Name : Dance Girl");
	    JLabel i5l2 =  new JLabel("Artist : Racheal");
	    JLabel i5l3 = new JLabel ("Material: Oil Crayons");
	    JLabel i6l = new JLabel();
	    JLabel i6l1 = new JLabel("Name : BLue Path");
	    JLabel i6l2 =  new JLabel("Artist : Elon");
	    JLabel i6l3 = new JLabel ("Material: Oil Paint");
	    
	    //public static JLabel forward = new JLabel();
	    
	    
	    ImageIcon[] scrollicon=new ImageIcon[3];
	
		
		//constructor code
	    
	    
	    l.setBounds(0,0,1366,768);
		ImageIcon icon = new ImageIcon("res/framebackground.jpg");
	    l.setIcon(icon);
	 
	    
	    min.setBounds(1252,6,50,51);
	    close.setBounds(1316,6,50,51);
	    
	   close.setOpaque(false);
	   close.setContentAreaFilled(false);
	   close.setBorderPainted(false);
	 //  close.addActionListener(this);
	  
	   min.setOpaque(false);
	   min.setContentAreaFilled(false);
	   min.setBorderPainted(false);
	   
	   
	   // min.addActionListener(this);
	   min.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ev) {
		    	  homeframe.setState(JFrame.ICONIFIED);}
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
	    homeframe.add(mainlogo);
	    JLabel tagline = new JLabel("       Paint the world");
	    tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
	    tagline.setForeground(Color.WHITE);
	    tagline.setBounds(15, 40, 300, 90);
	    homeframe.add(tagline);
	  
	      
	      
	      
	      b1.setBounds(10,100,220,28);
	      b1.setBackground(Color.WHITE);
	      b1.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent ev) {
	        	  
	        	  
	          }
	      });
	      
	          
	      b2.setBounds(230,100,220,28);
	      b2.setBackground(Color.WHITE);
	      b2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent ev) {
	        	  
	        	new UpSign();
	        	homeframe.setVisible(false);
	        	homeframe.dispose();
	        	 
	        	  
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
	        	homeframe.setVisible(false);
	        	homeframe.dispose();
	        	 
	        	  
	          }
	      });
	      
	    b6.setBounds(1100,100,220,28);
	     b6.setBackground(Color.WHITE);
	     b6.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent ev) {
	       	  
	       	new ContactUs();
	       homeframe.setVisible(false);
	      	homeframe.dispose();
	       	 
	       	  
	         }
	     });    
	     
	   //item1 
	     make.add(item1);
	    item1.setOpaque(true);
	    item1.setBackground(Color.WHITE);
	    item1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	new popularimages();
	        	homeframe.setVisible(false);
	        	homeframe.dispose();
	        }
	    });
	    
	    //item2
	    
	    make.add(item2);
	    item2.setOpaque(true);
	    item2.setBackground(Color.WHITE);
	    item2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	new popularimages();
	        	homeframe.setVisible(false);
	        	homeframe.dispose();
	        }
	    });
	    
	    
	    
	    make.add(item3);
	    item3.setOpaque(true);
	    item3.setBackground(Color.WHITE);
	    item3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	new popularimages();
	        	homeframe.setVisible(false);
	        	homeframe.dispose();
	        }
	    });
	    
	    
	    
	    make.add(item4);
	    item4.setOpaque(true);
	    item4.setBackground(Color.WHITE);
	    item4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	new popularimages();
	        	homeframe.setVisible(false);
	        	homeframe.dispose();
	        }
	});
	    
	    
	    
	  
	    menuBar.add(make);
	    menuBar.setBounds(670,100,220,28);
	    menuBar.setBackground(Color.WHITE);
	    homeframe.add(menuBar);
			    
		
	    JLabel frameback = new JLabel();
	    frameback.setBounds(0, 110, 1365, 700);
	    ImageIcon backgr = new ImageIcon("res/homeback.jpg");
	    frameback.setIcon(backgr);
	    
	    
			    //path of image
			    scrollicon[0] = new ImageIcon("res/scrollimage0.jpg");
			    scrollicon[1]=new ImageIcon("res/scrollimage1.jpg");
			    scrollicon[2]=new ImageIcon("res/scrollimage2.jpg");
			    //scroll image main
			    scrollimage.setIcon(scrollicon[0]);
			    scrollimage.setBounds(228,130,890,250);
			    
			    
			    //button on main scroll image
			    leftimagebutton.setBounds(421, 347, 50,30);
			    
			    //forward.setBounds(836, 347, 50, 30);
			    ImageIcon fr = new ImageIcon("res/forwardnotclick.png");
			    rightimagebutton.setIcon(fr);
			//    rightimagebutton.addMouseListener(this);
			    
			    
			    ImageIcon bk =new ImageIcon("res/backwardnotclick.png");
			    leftimagebutton.setIcon(bk);
			  //  leftimagebutton.addMouseListener(this);
			    
			    
			    
			    
			    rightimagebutton.setBounds(836, 347, 50, 30);
			   // leftimagebutton.addActionListener(this);
			    
			   
			    
			    leftimagebutton.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent ev) {
			        int ex=	temp.countdec();
					scrollimage.setIcon(scrollicon[ex]);
					
			        }
			});	    
			   
			    
			    
			    
			    //rightimagebutton.addActionListener(this);
			    rightimagebutton.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent ev) {
			        
			        	int tt=temp.countinc(scrollicon.length-1);
					scrollimage.setIcon(scrollicon[tt]);
			        }
			    			});	    
			   
			    
			    //side images
				leftsideimage.setIcon(new ImageIcon("res/fextremeleft.jpg"));
			    leftsideimage.setBounds(0,130,224,638);
			    rightsideimage.setIcon(new ImageIcon("res/fextremeright.jpg"));
			    rightsideimage.setBounds(1122,130,240,638);
			   
			    
			    
			    //small images
			    
			    i1b.setBounds(234, 390, 140, 175);
			    i1b.setIcon(new ImageIcon("res/i1.jpg"));
			    i1l1.setBounds(380, 180, 200, 500);
			    i1l1.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i1l1.setForeground(Color.BLACK);
			    homeframe.add(i1l1);
			    i1l2.setBounds(380, 220, 200, 500);
			    i1l2.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i1l2.setForeground(Color.BLACK);
			    homeframe.add(i1l2);
			    i1l3.setBounds(380, 260, 200, 500);
			    i1l3.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i1l3.setForeground(Color.BLACK);
			    homeframe.add(i1l3);
			    
			    homeframe.add(i1b);
			    
			    i2b.setBounds(534, 390, 140, 175);
			    i2b.setIcon(new ImageIcon("res/i2.jpg"));
			    i2l1.setBounds(680, 180, 200, 500);
			    i2l1.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i2l1.setForeground(Color.BLACK);
			    homeframe.add(i2l1);
			    i2l2.setBounds(680, 220, 200, 500);
			    i2l2.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i2l2.setForeground(Color.BLACK);
			    homeframe.add(i2l2);
			    i2l3.setBounds(680, 260, 200, 500);
			    i2l3.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i2l3.setForeground(Color.BLACK);
			    homeframe.add(i2l3);
			    homeframe.add(i2b);
			    
			    i3b.setBounds(834, 390, 140, 175);
			    i3b.setIcon(new ImageIcon("res/i3.jpg"));
			    i3l1.setBounds(980, 180, 200, 500);
			    i3l1.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i3l1.setForeground(Color.BLACK);
			    homeframe.add(i3l1);
			    i3l2.setBounds(980, 220, 200, 500);
			    i3l2.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i3l2.setForeground(Color.BLACK);
			    homeframe.add(i3l2);
			    i3l3.setBounds(980, 260, 200, 500);
			    i3l3.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i3l3.setForeground(Color.BLACK);
			    homeframe.add(i3l3);
			    homeframe.add(i3b);
			    
			    i4b.setBounds(234, 568, 140, 170);
			    i4b.setIcon(new ImageIcon("res/i4.jpg"));
			    i4l1.setBounds(380, 360, 200, 500);
			    i4l1.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i4l1.setForeground(Color.BLACK);
			    homeframe.add(i4l1);
			    i4l2.setBounds(380, 400, 200, 500);
			    i4l2.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i4l2.setForeground(Color.BLACK);
			    homeframe.add(i4l2);
			    i4l3.setBounds(380, 440, 200, 500);
			    i4l3.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i4l3.setForeground(Color.BLACK);
			    homeframe.add(i4l3);
			    homeframe.add(i4b);
			    
			    i5b.setBounds(534, 568, 140, 170);
			    i5b.setIcon(new ImageIcon("res/i5.jpg"));
			    i5l1.setBounds(680, 360, 200, 500);
			    i5l1.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i5l1.setForeground(Color.BLACK);
			    homeframe.add(i5l1);
			    i5l2.setBounds(680, 400, 200, 500);
			    i5l2.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i5l2.setForeground(Color.BLACK);
			    homeframe.add(i5l2);
			    i5l3.setBounds(680, 440, 200, 500);
			    i5l3.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i5l3.setForeground(Color.BLACK);
			    homeframe.add(i5l3);
			    homeframe.add(i5b);
			    
			    i6b.setBounds(834, 568, 140, 170);
			    i6b.setIcon(new ImageIcon("res/i6.jpg"));
			    i6l1.setBounds(980, 360, 200, 500);
			    i6l1.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i6l1.setForeground(Color.BLACK);
			    homeframe.add(i6l1);
			    i6l2.setBounds(980, 400, 200, 500);
			    i6l2.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i6l2.setForeground(Color.BLACK);
			    homeframe.add(i6l2);
			    i6l3.setBounds(980, 440, 200, 500);
			    i6l3.setFont(new Font("SansSerif", Font.PLAIN,17));
			    i6l3.setForeground(Color.BLACK);
			    homeframe.add(i6l3);
			    homeframe.add(i6b);
			   
			    
			    
			   
			    
			    homeframe.add(b1);
			    homeframe.add(b2);
			    homeframe.add(b3);
			//    homeframe.add(b4);
			    homeframe.add(b5);
			   homeframe.add(b6);
			   //homeframe.add(forward);
			    homeframe.add(leftimagebutton);
			    homeframe.add(rightimagebutton);
			    homeframe.add(leftsideimage);
			    homeframe.add(rightsideimage);
			    homeframe.add(scrollimage);
		

			    
	    homeframe.add(frameback);
	    
	    
	    //adding frame
	   
	    homeframe.add(min);
	    
	    homeframe.add(close); homeframe.add(l);
	    
	    homeframe.setUndecorated(true);
	    
		homeframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		  

	    homeframe.setSize(1366,768);
	    
	    homeframe.setVisible(true);
	    
//ended constructor
	    
		
	    
		
}
}

