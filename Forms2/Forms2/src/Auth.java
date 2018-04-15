import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Auth extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auth frame = new Auth();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Auth() {
		setTitle("Авторизация");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 236, 135);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(82, 43, 125, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(82, 74, 125, 20);
		panel.add(passwordField);
		
		JLabel label = new JLabel("\u041B\u043E\u0433\u0438\u043D:");
		label.setBounds(26, 46, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u041F\u0430\u0440\u043E\u043B\u044C:");
		label_1.setBounds(26, 77, 46, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(82, 18, 125, 14);
		panel.add(label_2);
		
		JButton btnNewButton = new JButton("\u0412\u0445\u043E\u0434");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(92, 101, 99, 23);
		panel.add(btnNewButton);
		
	}
}
