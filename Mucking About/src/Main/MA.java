package Main;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;

public class MA extends JFrame{
	
	
	private JLabel text1;
	public MA(){
		super("You're In");
		setLayout(new FlowLayout()); 
		MA.setDefaultLookAndFeelDecorated(true);
		text1 = new JLabel("Welcome");
		text1.setToolTipText("Genius");
		add(text1);
		JButton Btn = new JButton("Press Me");
	
	}
	
	
	
public static void main(String[] args){
	int tries = 0;
	String fullName;
	boolean entered = false;
	String firstName=JOptionPane.showInputDialog("First Name","Enter First Name");
	String lastName=JOptionPane.showInputDialog("Last Name","Enter Last Name");
	String password= JOptionPane.showInputDialog("Password","Enter Password");
	String realPass = "jacob";
	fullName = firstName + " " + lastName;
	//String anotherFirstName= firstName;
	
	System.out.println(fullName);
	//System.out.println(firstName.equals(lastName));
	//System.out.println(firstName.equals(anotherFirstName));
	
	if (password.equals(realPass)){
		
		entered(fullName);
	}
	
	else{
		tries = tries + 1;
		
		while (tries < 5){
			
				System.out.println("Password Incorrect");
				tries = tries+1;
				password= JOptionPane.showInputDialog("Password","Enter Password");
				if (password.equals(realPass)){
					
					entered(fullName);
				}
		}
		
		if (password.equals(realPass)){}
		else{
		System.out.println("Max number of tries reached");
		System.out.println("System Exiting");
		System.exit(0);
		}
	}
}
	
			
			
public static void entered(String fullName) {
			System.out.println("Password Correct");
			
			
		System.out.println("Welcome " + fullName);

		
		MA frame = new MA();
		frame.setSize(500,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
}
}
