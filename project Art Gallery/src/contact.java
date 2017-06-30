

	import java.awt.Color;
	import java.awt.Font;

	import javax.swing.*;
	public class contact{
		
		
		public static JFrame f = new JFrame();
		public static JPanel p = new JPanel();
		public static JPanel pan = new JPanel();
		public static JScrollPane sp = new JScrollPane();
		public static JButton b1 = new JButton("Home");
	    public static JButton b2 = new JButton("Register");
	    public static JButton b3 = new JButton("Contact");
	    public static JButton b4 = new JButton("Home");
	    public static JButton b5 = new JButton("Register");
	    public static JButton b6 = new JButton("Contact");
	    
	    public static JLabel pform = new JLabel("Contact US");
	    
	    public static JLabel pname = new JLabel("Name:*");
	  //  public static JLabel ptype = new JLabel("Product Type:*");
	    public static JLabel email = new JLabel("email:*");
	    public static JLabel phone = new JLabel("Phone Number:*");
	    
	    //public static JLabel image = new JLabel("Image:*");
	   // public static JButton img = new JButton("Choose File"); 
	    public static JLabel noofpro = new JLabel("Subject:*");
	    public static JLabel desc = new JLabel("Message:*");
	    
	    
	    
	    public static JTextField proname = new JTextField();
	    public static JTextField protype = new JTextField();
	    public static JTextField procomp = new JTextField();
	    public static JTextField prophone = new JTextField();
	    public static JTextField noofprod = new JTextField();
	    
	    
	    
	    public static JTextArea descr = new JTextArea();
	    public static JButton save = new JButton("Save Product");
	    public static JButton reset = new JButton("Reset Form"); 
	    
	    public static JLabel imageicon = new JLabel();
	    public static JLabel back = new JLabel();
	    
	    public contact() {
			    JLabel mainlogo = new JLabel("Art Gallery..");
			    mainlogo.setFont(new Font("Monotype Corsiva", Font.BOLD, 45));
			    mainlogo.setForeground(Color.WHITE);
			    mainlogo.setBounds(10, 10, 300, 90);
			    f.add(mainlogo);
			    JLabel tagline = new JLabel("       Paint the world");
			    tagline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,20));
			    tagline.setForeground(Color.WHITE);
			    tagline.setBounds(15, 40, 300, 90);
			    f.add(tagline);
			    
			   
			    
	    
	    
	    
	    b1.setBounds(10,142,220,28);
	    b1.setBackground(Color.WHITE);
	        
	    b2.setBounds(230,142,220,28);
	    b2.setBackground(Color.WHITE);
	    
	    b3.setBounds(450,142,220,28);
	    b3.setBackground(Color.WHITE);
	    
	    b4.setBounds(670,142,220,28);
	    b4.setBackground(Color.WHITE);
	        
	    b5.setBounds(890,142,220,28);
	    b5.setBackground(Color.WHITE);
	    
	    b6.setBounds(1110,142,220,28);
	    b6.setBackground(Color.WHITE);
	    p.add(b1);
	    p.add(b2);
	    p.add(b3);
	    p.add(b4);
	    p.add(b5);
	    p.add(b6);
	    
	    f.add(b1);
	    f.add(b2);
	    f.add(b3);
	    f.add(b4);
	    f.add(b5);
	    f.add(b6);
	    
	    
	    pform.setBounds(20,5,120,20);
	    
	    pname.setBounds(20,45,120,20);
	 //   ptype.setBounds(450,50,120,20);
	    email.setBounds(20,120,120,20);
	    phone.setBounds(20,195,120,20);
	    
	    proname.setBounds(20,70,450,30);
	   // protype.setBounds(450,75,350,30);
	    procomp.setBounds(20,145,450,30);
	    prophone.setBounds(20,215,450,30);
	    
	    //image.setBounds(20,205,120,20);
	    //img.setBounds(90,205,120,20);
	    
	    noofpro.setBounds(20,270,300,20);
	    noofprod.setBounds(20,290,450,30);
	    
	    desc.setBounds(20,330,120,20);
	    descr.setBounds(20,360,300,100);
	    
	    save.setBounds(400,400,80,30);
	    reset.setBounds(400,450,80,30);
	    
	    
	    
	  
	    pan.setBounds(10,250,900,800);
	    //pan.setBackground(Color.GRAY);
	    pan.setLayout(null);
	    pan.setVisible(true);
	    pan.setOpaque(false);
	   
	    //f.add(sp);
	    
	    pan.add(pform);
	    
	    pan.add(pname);
	    
	  //  pan.add(ptype);
	    pan.add(email);
	    pan.add(phone);
	    
	    pan.add(proname);
	    pan.add(protype);
	    pan.add(procomp);
	    pan.add(prophone);
	  //  pan.add(image);
	    //pan.add(img);
	    pan.add(noofpro);
	    pan.add(noofprod);
	    pan.add(desc);
	    pan.add(descr);
	    pan.add(save);
	    pan.add(reset);
	    
	    
	    
	    imageicon.setBounds(950,260,440,450);
	    ImageIcon icon = new ImageIcon("New Bitmap Image.png");
		imageicon.setIcon(icon);
		back.setBounds(0,0,1366,768);
	    ImageIcon BackImg = new ImageIcon("https://d2gg9evh47fn9z.cloudfront.net/800px_COLOURBOX3386385.jpg");
	    back.setIcon(BackImg);
	   
		
		
		
		f.add(imageicon);
		f.add(back);
		 f.add(pan); 
	    
	    }
		
		public static void main(String args[]) {
			new contact();
			
			
			//f.getContentPane().setBackground(new java.awt.Color(255, 51, 51));  
	  	  f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	  	  
	  	  f.setSize(1368, 768);
	  	  f.setLayout(null);
	  	  f.setVisible(true);
		}

	}


