import java.awt.Color;

import javax.swing.*;

public class homepage {
public static void main(String args[])
{
	JFrame f=new JFrame("Art Gallery");
	JButton home=new JButton("HOME");
	JButton allarts=new JButton("ALL ARTS");
	JButton sur=new JButton("SURREALISM");
	JButton concept=new JButton("CONCEPTUAL");
	JButton contact=new JButton("CONTACT US");
	JLabel label1=new JLabel("ART GALLERY");
	JLabel label3=new JLabel();
	
	//main logo
	
	label1.setBounds(0,20,90,30);
	label1.setHorizontalAlignment(JLabel.LEFT);
	label1.setVerticalAlignment(JLabel.TOP);
	//logo end
	//uper side fragments button
	home.setBounds(10, 40, 130, 20);
	f.add(home);
	allarts.setBounds(140,40,130,20);
	f.add(allarts);
	sur.setBounds(270,40,130,20);
	f.add(sur);
	concept.setBounds(400,40,130,20);
	f.add(concept);
	contact.setBounds(530,40,130,20);
	f.add(contact);
	
	//label3
	ImageIcon icon = new ImageIcon("res/Art.jpg");
	label3.setIcon(icon);
	
	label3.setBounds(10,60,650,150);
	f.add(label3);
	label3.setVisible(true);
	f.getContentPane().setBackground(new java.awt.Color(255, 51, 51));	
	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	f.add(label1);
	f.setSize(680, 1000);
	f.setLocale(null);
	f.setVisible(true);
}
}
