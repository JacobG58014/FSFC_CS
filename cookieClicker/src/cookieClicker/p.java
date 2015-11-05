package cookieClicker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class p {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int Cookies = 0;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p window = new p();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public p() {
		initialize(0);
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize(int Cookies) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		JButton btnNewButton_1 = new JButton("Cursor");
		btnNewButton_1.setBounds(0, 217, 147, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Grandma");
		btnNewButton_2.setBounds(146, 217, 147, 45);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Farm");
		btnNewButton_3.setBounds(292, 217, 142, 45);
		frame.getContentPane().add(btnNewButton_3);
		
		JTextPane txtpnCookies = new JTextPane();
		txtpnCookies.setFont(new Font("DFKai-SB", Font.PLAIN, 18));
		txtpnCookies.setText("Cookies: "+ Cookies);
		txtpnCookies.setBounds(292, 0, 142, 50);
		frame.getContentPane().add(txtpnCookies);
		
		JButton btnGoldenCookie = new JButton("");
		btnGoldenCookie.setIcon(new ImageIcon("C:\\Users\\CompUser\\Pictures\\GOLDEN.png"));
		btnGoldenCookie.setBounds(292, 51, 142, 168);
		frame.getContentPane().add(btnGoldenCookie);
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			//	Cookies = (Cookies + 1);
				System.out.println("Pressed");
				Pressed(Cookies, txtpnCookies);
			}
		});
	btnNewButton.setIcon(new ImageIcon("C:\\Users\\CompUser\\Pictures\\Cookie.jpg"));
		btnNewButton.setToolTipText("I AM A COOKIE");
		btnNewButton.setBounds(0, 0, 293, 219);
		frame.getContentPane().add(btnNewButton);
	}
void Pressed(int Cookies, JTextPane txtpnCookies){
	Cookies = Cookies + 1;
	txtpnCookies.setText("Cookies: "+ Cookies);

}
}
