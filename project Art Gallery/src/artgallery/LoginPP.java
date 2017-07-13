package artgallery;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginPP{

LoginPP(){
		JFrame loginframe = new JFrame();
	 JLabel username = new JLabel("USERNAME*");
	 	JLabel line = new JLabel(" Login to your Art Gallery Account");
	 JTextField usernametext = new JTextField(); 
	 JLabel password = new JLabel("PASSWORD*");
	  JPasswordField passwordtext = new JPasswordField();
	 JButton Fpassword = new JButton("Forget Password?");
	 JButton b = new JButton("Sign In");
	 JLabel logp = new JLabel();
	 ImageIcon icon1 = new ImageIcon("res/logp.png");
	  JButton close = new JButton("X");


	
	  
	  
	  line.setFont(new Font("Century Gothic",Font.BOLD  ,25));
	  line.setForeground(Color.RED);
	  line.setBounds(40, 150, 800, 60);
	  Font font = line.getFont();
	  Map attributes = font.getAttributes();
	  attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
	  line.setFont(font.deriveFont(attributes));
	loginframe.add(line);
	 
	  
	  username.setFont(new Font("Comic Sans MS",Font.BOLD ,18));
	  username.setForeground(Color.white);
	  
	  username.setBounds(60, 250, 600, 30);
	  usernametext.setBounds(60, 285, 300, 30);
	  //LoginP.add(username);
	  loginframe.add(usernametext);
	  loginframe.add(username);
	  
	  
	  password.setFont(new Font("Comic Sans MS",Font.BOLD ,18));
	  password.setForeground(Color.white);
	  //password.setOpaque(true);
	 
	  password.setBounds(60, 340, 600, 20);
	  passwordtext.setBounds(60, 370, 300, 30);
	  loginframe.add(password);
	  loginframe.add(passwordtext);
	  
	 
	  Fpassword.setFont(new Font("Times New Roman",Font.PLAIN ,13));
	  Fpassword.setForeground(Color.BLACK);
	  Fpassword.setBounds(350, 520, 135, 30);
	  Fpassword.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ev) {
	    		JFrame gotp = new JFrame("Get OTP");
	    		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	    		  gotp.setLocation(dim.width/2-gotp.getSize().width/2, dim.height/2-gotp.getSize().height/2);
	    		JLabel num = new JLabel("Enter you Contact Number");
	    		num.setBounds(30, 40, 400, 30);
	    		gotp.add(num);
	    		JTextField numb = new JTextField();
	    		numb.setBounds(30, 80, 200, 30);
	    		gotp.add(numb);
	    		JButton get = new JButton("Get OTP");
	    		get.setBounds(50, 130, 90, 30);
	    		gotp.add(get);
	    		get.addActionListener(new ActionListener() {
	    	         public void actionPerformed(ActionEvent ev) {
	    	        	 gotp.dispose();
	    	         }
	    	     });;
	    		JLabel hey = new JLabel("hey");
	    		hey.setBounds(50, 350, 100, 100);
	    		gotp.add(hey);
	    		//gotp.getContentPane().setBackground(new java.awt.Color(0, 0, 0));  
	    		  gotp.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    		gotp.setVisible(true);
	    		gotp.setLayout(null);
	    	    gotp.setSize(280,280);
	    	    	 
	      
	      
	      }
	});

	    loginframe.add(Fpassword);
	  	
			b.setBounds(150, 450, 95, 30);
			loginframe.add(b);
	       //sign in code
			 b.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent ev) {
			      	  try{
			      		Class.forName("oracle.jdbc.driver.OracleDriver");  
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","artdetails","tiger");  
						      
						PreparedStatement ps=con.prepareStatement("select type from users where username=? and password=?");

						ps.setString(1,usernametext.getText());
						ps.setString(2,String.valueOf(passwordtext.getPassword()));
						ResultSet rs=ps.executeQuery();  
						
						
						String type;
						if(rs.next())	
						{ type=rs.getString("type");
							JOptionPane.showMessageDialog(null,"match");  
						if(type.equals("Artist"))
						{new addart();
						
							loginframe.setVisible(false);
							loginframe.dispose();
							}
						else
						{new popularimages();
						loginframe.setVisible(false);
						loginframe.dispose();
						}
						}else
							JOptionPane.showMessageDialog(null,"usersname or password doesn't match");  
						
						} 
			      	  catch(Exception e)
			      	  {JOptionPane.showMessageDialog(null,e);}
			   }
			    });
	   
	  logp.setBounds(0, 0, 500, 583);
	  
	  logp.setIcon(icon1);
	  loginframe.add(logp);
	  
	 
	  close.setBounds(455, 0, 42, 35);
	   close.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ev) {
		    	  loginframe.setVisible(false);
		  		loginframe.dispose();
		  		
		      
		      
		      }
		});

	  
	  
	  
	  loginframe.add(close);
	    
	  loginframe.setUndecorated(true);
	  loginframe.getContentPane().setBackground(new java.awt.Color(10, 61, 98));  
	  //loginframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	  
	  
	  loginframe.setSize(500, 583);
	  //f.setBackground(new Color(0,0,0,0));
	  
	  
	  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	  loginframe.setLocation(dim.width/2-loginframe.getSize().width/2, dim.height/2-loginframe.getSize().height/2);
	  
	  loginframe.setLayout(null);
	  loginframe.setVisible(true);

}
}