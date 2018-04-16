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

public class Menu extends JFrame {

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
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Μενώ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 365);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 254, 300);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0412\u044B\u0439\u0442\u0438 \u0438\u0437 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u044B");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(48, 263, 150, 25);
		panel.add(btnNewButton);
		
		JButton button = new JButton("\u0423\u0447\u0435\u0442 \u0440\u0430\u0431\u043E\u0447\u0435\u0433\u043E \u0432\u0440\u0435\u043C\u0435\u043D\u0438");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(10, 11, 225, 25);
		panel.add(button);
		
		JButton button_1 = new JButton("\u0420\u0430\u0431\u043E\u0442\u0430 \u0441 \u0430\u0432\u0430\u043D\u0441\u0430\u043C\u0438");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_1.setBounds(10, 47, 225, 25);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u0420\u0430\u0441\u043F\u0440\u0435\u0434\u0435\u043B\u0435\u043D\u0438\u0435 \u043F\u0440\u0435\u043C\u0438\u0430\u043B\u044C\u043D\u043E\u0433\u043E \u0444\u043E\u043D\u0434\u0430");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_2.setBounds(10, 83, 225, 25);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\u0420\u0430\u0441\u0447\u0435\u0442 \u0417\u041F");
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_3.setBounds(10, 119, 225, 25);
		panel.add(button_3);
		
		JButton button_4 = new JButton("\u0423\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043D\u0438\u0435 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432");
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_4.setBounds(10, 155, 225, 25);
		panel.add(button_4);
		
		JButton button_5 = new JButton("\u0411\u0430\u0437\u0430 \u0434\u0430\u043D\u043D\u044B\u0445 \u0441\u043E\u0442\u0440\u0443\u0434\u043D\u0438\u043A\u043E\u0432");
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_5.setBounds(10, 191, 225, 25);
		panel.add(button_5);
		
		JButton button_6 = new JButton("\u0421\u0442\u0430\u0432\u043A\u0438 \u043D\u0430\u043B\u043E\u0433\u043E\u043E\u0431\u043B\u043E\u0436\u0435\u043D\u0438\u044F");
		button_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_6.setBounds(10, 227, 225, 25);
		panel.add(button_6);
		
	}
}
