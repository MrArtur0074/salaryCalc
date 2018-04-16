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
import java.awt.Font;

public class MenuDeptBoss extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuDeptBoss frame = new MenuDeptBoss();
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
	public MenuDeptBoss() {
		setTitle("Μενώ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 142);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 254, 80);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0412\u044B\u0439\u0442\u0438 \u0438\u0437 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u044B");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(54, 47, 150, 25);
		panel.add(btnNewButton);
		
		JButton button = new JButton("\u0423\u0447\u0435\u0442 \u0440\u0430\u0431\u043E\u0447\u0435\u0433\u043E \u0432\u0440\u0435\u043C\u0435\u043D\u0438");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(10, 11, 225, 25);
		panel.add(button);
		
	}
}
