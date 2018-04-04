
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class guiRestaurant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class guiRestaurant
{
    public static JFrame theGUI;
    
    static JFrame ticketBooth;
    public static JFrame checkOut;
    public static JFrame confirm;
    public static JFrame thanks;
        public static void main(String[] args){    
        theGUI = new JFrame();
        theGUI.setTitle("AMC Movies");
        theGUI.setSize(800,800);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theGUI.setVisible(true);
        
        //Label for Month
        JPanel menu = new JPanel(); // makes the panel 
        menu.setPreferredSize(new Dimension(1000,200)); //sets dimensions
        JLabel titleLabel = new JLabel("Welcome to The Macon Bacon Restaurant!"); // makes the label
        titleLabel.setFont(titleLabel.getFont().deriveFont(25.0f)); // makes font bigger
        menu.add(titleLabel); // Adds label to movie panel\
        theGUI.setLayout(new BoxLayout(theGUI.getContentPane(), BoxLayout.Y_AXIS));
        theGUI.add(menu); //brings it into the frame        
    }
}
