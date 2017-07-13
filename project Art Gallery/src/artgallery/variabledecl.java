package artgallery;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class variabledecl {
	public static	JLabel l=new JLabel();
	public static   JButton close=new JButton();
	public static 	JButton min=new JButton();

	public static JFrame addcart=new JFrame();
	public static JButton b1 = new JButton("Home");
	public static JButton b2 = new JButton("Register");
	public static JButton b3 = new JButton("Login");
	//public static JButton b4 = new JButton("Home");
	public static JButton b5 = new JButton("About Us");
	public static JButton b6 = new JButton("Contact");
	public static JMenuBar menuBar = new JMenuBar();
    public static JMenu make = new JMenu("Genre                                                             ");
    public static JMenuItem item1 = new JMenuItem("Popular Artwork                                           ");
    public static JMenuItem item2 = new JMenuItem("Modern Art");		   
    public static JMenuItem item3 = new JMenuItem("Abstract Art");
    public static JMenuItem item4 = new JMenuItem("Scenery Art");
   

	public static JButton blogout = new JButton("Logout");
    public static JLabel pform = new JLabel("Product Form");
    
    public static JLabel pname = new JLabel("Product Name:*");
    public static JLabel ptype = new JLabel("Product Type:*");
    public static JLabel pcompany = new JLabel("Product ID:*");
    public static JLabel price = new JLabel("Product Price:*");
    
    public static JLabel image = new JLabel("Image:*");
    public static JButton img = new JButton("Choose File"); 
    public static JLabel noofpro = new JLabel("Number Of Products in stock:*");
    public static JLabel desc = new JLabel("Description:");
    
    public static String collection[] = {"Modern Art", "Abstract Art", "Scenery Art"};
    
    
    public static JTextField proname = new JTextField();
    public static JComboBox protype = new JComboBox(collection);
    public static JTextField proid = new JTextField();
    public static JTextField proprice = new JTextField();
    public static JTextField noofprod = new JTextField();
    
    
    
    public static JTextArea descr = new JTextArea();
    public static JButton save = new JButton();
    public static JButton reset = new JButton("Reset Form"); 
    
    public static JLabel imageicon = new JLabel();
    public static JLabel back = new JLabel();
    
    public static JTextArea log = new JTextArea();
    public static JFileChooser fc = new JFileChooser();
    public static JLabel display = new JLabel();
    public static JTextField disp = new JTextField();
    
    public static JLabel canvas = new JLabel(); 
    
    //ADDRESS CLASS
	

	public static JFrame addressframe=new JFrame();

   
    public static JLabel addname = new JLabel("Name*:");
    public static JTextField addnametext = new JTextField();
    public static JLabel addphone = new JLabel("PhoneNumber*:");
    public static JTextField addphonetext = new JTextField();
    public static JLabel addmsg = new JLabel("Shipping Address:*");
    public static JTextArea addmsgtext = new JTextArea();
    public static JButton addpay = new JButton("Pay Now");
    
    //payment
   

	public static JFrame paymentframe=new JFrame("Art Gallery");
	//public static JButton b4 = new JButton("Home");
	
    
    public static JLabel pay = new JLabel("Make Payment");
    public static JLabel cardImg = new JLabel();
    public static JLabel cardNo = new JLabel("Credit Card Number*");
    public static JLabel name = new JLabel("Name on card*");
    public static JLabel type = new JLabel("Card Type*");
    public static JLabel expire = new JLabel("Expiry date*");
    public static JLabel cvv = new JLabel("CVV No.*");
    public static JLabel paid = new JLabel("Amount Paid*");
    
    public static JTextField Tname = new JTextField();
    public static JTextField Tcard = new JTextField();
    public static JTextField Ttype = new JTextField();
    public static JPasswordField Tcvv = new JPasswordField();
    public static JTextField Tamt = new JTextField();
    
    
    public static JButton mp = new JButton("Make Payment");
    public static JButton cp = new JButton("Cancel Payment");
    
    static String mon[] = {"Month", "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
    public static JComboBox month = new JComboBox(mon);
    
    static String yr[] = {"Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
    public static JComboBox year = new JComboBox(yr);
    
    public static JLabel card = new JLabel();
    public static JLabel artwork1 = new JLabel();
    public static JLabel artwork2 = new JLabel();
    public static JLabel artwork3 = new JLabel();
    public static JLabel artwork4 = new JLabel();

    public static JLabel background = new JLabel();
    
    //SPLASSCREEN
    JFrame splashf = new JFrame("Art Gallery");
	JLabel SplashBack = new JLabel();
	JLabel slogan = new JLabel("Welcome to Art Gallery");
	
	JButton spenter = new JButton();
	
    
	
}
