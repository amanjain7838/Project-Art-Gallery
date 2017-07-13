package artgallery;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class SplashScreen extends variabledecl implements MouseListener, ActionListener{
	
	
	SplashScreen() {
		SplashBack.setBounds(0,0,800,500);
		ImageIcon icon = new ImageIcon("res/splash.jpg");
		SplashBack.setIcon(icon);
		
		slogan.setBounds(210,100,550,60);
		slogan.setFont(new Font("Heritage", Font.BOLD, 55));
		slogan.setForeground(Color.WHITE);
		
		
		spenter.setBorder(null);
		ImageIcon icon1 = new ImageIcon("res/splashnotclick.jpg");
		spenter.setIcon(icon1);
		
		spenter.setBounds(350,200,86,84);
		spenter.addMouseListener(this);
		spenter.addActionListener(this);
		
		
	
		splashf.add(spenter);
		splashf.add(slogan);
		splashf.add(SplashBack);
		splashf.setSize(800,500);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		  splashf.setLocation(dim.width/2-splashf.getSize().width/2, dim.height/2-splashf.getSize().height/2);
		  splashf.setUndecorated(true);
		  splashf.setLayout(null);
		  splashf.setVisible(true);
		
	}
	public static void main(String args[]) {
		new SplashScreen();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		spenter.setBounds(353,203,86,84);
		 spenter.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent ev) {
		      	  
		      	new HomePage();
		      	splashf.setVisible(false);
		      	splashf.dispose();
		      	 
		      	  
		        }
		    });
		   
		
		
		
		
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		spenter.setBounds(350,200,86,84);
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		splashf.setVisible(false);
		splashf.dispose();
		
		new HomePage();
		
	}
	
	

}
