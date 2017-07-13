package artgallery;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.*;

public class addart extends variabledecl implements ActionListener, MouseListener {
	
    
    
    
    
    
	addart()
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
    addcart.add(mainlogo);
    JLabel tagline = new JLabel("       Paint the world");
    tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
    tagline.setForeground(Color.WHITE);
    tagline.setBounds(15, 40, 300, 90);
    addcart.add(tagline);
  
      
      
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
    //b4.setBounds(670,100,220,28);
    //b4.setBackground(Color.WHITE);
        
    b5.setBounds(890,100,220,28);
    b5.setBackground(Color.WHITE);
    b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
      	  
      	new About();
      	addcart.setVisible(false);
      	addcart.dispose();
      	 
      	  
        }
    });
    
  b6.setBounds(1100,100,220,28);
   b6.setBackground(Color.WHITE);
   b6.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ev) {
     	  
     	new ContactUs();
     	addcart.setVisible(false);
     	addcart.dispose();
     	 
     	  
       }
   });    
   
    
      blogout.setBounds(670,100,220,28);
      blogout.setBackground(Color.WHITE);
  
      blogout.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ev) {
        	 new LoginPP();
          }
      });
      
     addcart.add(blogout);
     
     
     
    

     
     b1.setEnabled(false);
     b2.setEnabled(false);
     b5.setEnabled(false);
     b6.setEnabled(false);
     
        
		    addcart.add(b1);
		    addcart.add(b2);
		    addcart.add(b3);
		//    addcart.add(b4);
		    addcart.add(b5);
		   addcart.add(b6);
		   
		   
		   canvas.setBounds(550,190,780,500);
		    ImageIcon ic = new ImageIcon("res/Canvas.jpg");
		    canvas.setIcon(ic);
		    addcart.add(canvas);
		    
		    
		    
		    pform.setBounds(20,230,120,20);
		    Font font = new Font("AR CENA",Font.PLAIN,18);
		    
		    
		   pform.setFont(font);
		    
		    pname.setBounds(20,260,120,20);
		    font = new Font("AR CENA",Font.PLAIN,18);
		    pname.setFont(font);
		    
		    ptype.setBounds(260,260,120,20);
		    font = new Font("AR CENA",Font.PLAIN,18);
		    ptype.setFont(font);
		    
		    pcompany.setBounds(20,320,140,20);
		    font = new Font("AR CENA",Font.PLAIN,18);
		    pcompany.setFont(font);
		    
		    price.setBounds(260,320,120,20);
		    font = new Font("AR CENA",Font.PLAIN,18);
		    price.setFont(font);
		    
		    proname.setBounds(20,280,200,30);
		    
		    
		    protype.setBounds(260,280,200,30);
		    proid.setBounds(20,340,200,30);
		    proprice.setBounds(260,340,200,30);
		    
		    image.setBounds(20,395,120,20);
		    font = new Font("AR CENA",Font.PLAIN,18);
		    image.setFont(font);
		    
		    img.setBounds(90,395,120,30);
		    disp.setBounds(220,395,150,30);
		    img.addActionListener(this);
		    
		    noofpro.setBounds(20,440,300,20);
		    
		    font = new Font("AR CENA",Font.PLAIN,18);
		    noofpro.setFont(font);
		    
		    noofprod.setBounds(20,460,100,30);
		    
		    desc.setBounds(20,500,120,20);
		    font = new Font("AR CENA",Font.PLAIN,18);
		    desc.setFont(font);
		    
		    descr.setBounds(20,525,300,100);
		    
		    save.setBounds(400,525,123,33);
		    reset.setBounds(400,595,100,30);
		    reset.addActionListener(this);
		    ImageIcon saveButton = new ImageIcon("res/save.png");
			save.setIcon(saveButton);
			
			save.addMouseListener(this);
		    
		    save.addActionListener(this);
		    
		  
		   /* pan.setBounds(10,250,900,800);
		    //pan.setBackground(Color.GRAY);
		    pan.setLayout(null);
		    pan.setVisible(true);
		    pan.setOpaque(false);
		   
		    //f.add(sp);*/
		    

		    addcart.add(pform);
		    addcart.add(pname);
		    
		    addcart.add(ptype);
		    addcart.add(pcompany);
		    addcart.add(price);
		    
		    addcart.add(proname);
		    addcart.add(protype);
		    addcart.add(proid);
		    addcart.add(proprice);
		    addcart.add(image);
		    addcart.add(img);
		    addcart.add(disp);
		    addcart.add(noofpro);
		    addcart.add(noofprod);
		    addcart.add(desc);
		    addcart.add(descr);
		    addcart.add(save);
		    addcart.add(reset);
	

		    
    
    
    
    //adding frame
   
    addcart.add(min);
    
    addcart.add(close); addcart.add(l);
    
    
    
    addcart.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	  

    addcart.setSize(1366,768);
    addcart.setUndecorated(true);
    addcart.setVisible(true);
    
    
	
	
	
}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
    	ImageIcon ic = new ImageIcon("res/saveclicked.jpg");
    	save.setIcon(ic);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		ImageIcon ic = new ImageIcon("res/save.png");
    	save.setIcon(ic);
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	//int count=0;
	
	
	 
	 
	
		
		
	
	
	

	public static File file;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==close)
		{System.exit(0);}
		else if(e.getSource()==min)
	{addcart.setState(JFrame.ICONIFIED); }

        //Handle open button action.
		else if (e.getSource() == img) {
            int returnVal = fc.showOpenDialog(addcart);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                 file = fc.getSelectedFile();
                //This is where a real application would open the file.
                log.append("Opening: " + file.getName() + ".");
            } else {
                log.append("Open command cancelled by user.");
            }
            log.setCaretPosition(log.getDocument().getLength());  if(fc.showOpenDialog(addcart) == JFileChooser.APPROVE_OPTION) {
        	disp.setText(fc.getSelectedFile().getAbsolutePath());
        }
        }
		//reset
		if(e.getSource()==reset)
		{
		proid.setText("");
		proname.setText("");
		proprice.setText("");
		disp.setText("");
		noofprod.setText("");
		descr.setText("");
		}
		
        //save
		else if(e.getSource()==save)
		{
		if(disp.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null,"Enter the details correctly");
		}
		else 
		{upload();}
		}
		
	}
	
	public static void upload()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		      
		      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ARTDETAILS","tiger");
		      PreparedStatement ps = null; 
		      if((protype.getSelectedItem()).equals("Modern Art"))
		      {//JOptionPane.showMessageDialog(null,"here");
		      
		    	  ps=con.prepareStatement("insert into modern_art values(?,?,?,?)");  
		      
		      }
		      else if((protype.getSelectedItem()).equals("Abstract Art")){
			      ps=con.prepareStatement("insert into abstract_art values(?,?,?,?)");  
			      
		      }
		      else if((protype.getSelectedItem()).equals("Scenery Art"))
		      {   ps=con.prepareStatement("insert into scenery_art values(?,?,?,?)");  
			   }
		    	  
		      
		      ps.setInt(1, Integer.parseInt(proid.getText()));  
		        ps.setString(2, proname.getText());
		        ps.setInt(3,Integer.parseInt(proprice.getText()) );
		      FileInputStream fin=new FileInputStream(file);  
		      
		      
		      
		      ps.setBinaryStream(4,fin,fin.available());      
		      ps.executeUpdate();  

		      
		      JOptionPane.showMessageDialog(null,"Successfully uploaded");
		      
		}
		catch(Exception e)
		{System.out.println(e);}
	
	}
}


