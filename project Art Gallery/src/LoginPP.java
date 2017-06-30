import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginPP extends JFrame implements ActionListener{
public static	JFrame fr = new JFrame();
public static JLabel username = new JLabel("USERNAME*");
public static 	JLabel line = new JLabel(" Login to your Art Gallery Account");
public static JTextField usernametext = new JTextField(); 
public static JLabel password = new JLabel("PASSWORD*");
public static  JPasswordField passwordtext = new JPasswordField();
public static JButton Fpassword = new JButton("Forget Password?");
public static JButton b = new JButton("Sign In");
public static JLabel logp = new JLabel();
public static ImageIcon icon1 = new ImageIcon("res/logp.png");
public static  JButton close = new JButton("X");


	LoginPP(){
 
	
  
  
  line.setFont(new Font("Century Gothic",Font.BOLD  ,25));
  line.setForeground(Color.BLACK);
  line.setBounds(40, 150, 800, 60);
  Font font = line.getFont();
  Map attributes = font.getAttributes();
  attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
  line.setFont(font.deriveFont(attributes));
fr.add(line);
 
  
  username.setFont(new Font("Comic Sans MS",Font.BOLD ,18));
  username.setForeground(Color.BLACK);
  
  username.setBounds(60, 250, 600, 30);
  usernametext.setBounds(60, 285, 300, 30);
  //LoginP.add(username);
  fr.add(usernametext);
  fr.add(username);
  
  
  password.setFont(new Font("Comic Sans MS",Font.BOLD ,18));
  password.setForeground(Color.BLACK);
  //password.setOpaque(true);
 
  password.setBounds(60, 340, 600, 20);
  passwordtext.setBounds(60, 370, 300, 30);
  fr.add(password);
  fr.add(passwordtext);
  
 
  Fpassword.setFont(new Font("Times New Roman",Font.PLAIN ,13));
  Fpassword.setForeground(Color.BLACK);
  Fpassword.setBounds(350, 520, 135, 30);
  Fpassword.addActionListener(this);
  
  fr.add(Fpassword);
  	
		b.setBounds(150, 450, 95, 30);
		fr.add(b);
       
  
   
  logp.setBounds(0, 0, 500, 583);
  
  logp.setIcon(icon1);
  fr.add(logp);
  
 
  close.setBounds(455, 0, 42, 35);
  close.addActionListener(this);
  fr.add(close);
    
  fr.setUndecorated(true);
  fr.getContentPane().setBackground(new java.awt.Color(10, 61, 98));  
  fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  
  
  fr.setSize(500, 583);
  //f.setBackground(new Color(0,0,0,0));
  
  
  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
  fr.setLocation(dim.width/2-fr.getSize().width/2, dim.height/2-fr.getSize().height/2);
  
  fr.setLayout(null);
  fr.setVisible(true);
  
  //Login
}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==close){
			System.exit(0);
		}
		if(e.getSource()==Fpassword){
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
			JLabel hey = new JLabel("hey");
			hey.setBounds(50, 350, 100, 100);
			gotp.add(hey);
			//gotp.getContentPane().setBackground(new java.awt.Color(0, 0, 0));  
			  gotp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			gotp.setVisible(true);
			gotp.setLayout(null);
		    gotp.setSize(280,280);
		}
	}
public static void main(String args[]){
   new 	LoginPP();
}
}