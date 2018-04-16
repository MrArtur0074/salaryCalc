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
import java.awt.Font;

public class Prepaids extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prepaids frame = new Prepaids();
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
	public Prepaids() {
		setTitle("Работа с авансами");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 221);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Выйти в меню");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 148, 144, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Сохранить данные\r\n");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(10, 112, 193, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Распечатать расписку");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_1.setBounds(213, 112, 192, 25);
		contentPane.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 39, 395, 36);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_2 = new JLabel("Сотрудник:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_2.setBounds(10, 11, 60, 14);
		panel_3.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setBounds(80, 8, 305, 20);
		panel_3.add(comboBox);
		comboBox.setToolTipText("");
		comboBox.addItem("Альметьев Афанасий Викторович");
		comboBox.addItem("Савельева Наталья Владимировна");
		
		JLabel label = new JLabel("Номер документа:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label.setBounds(10, 14, 98, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(118, 11, 36, 20);
		contentPane.add(textField);
		
		JLabel label_3 = new JLabel("Дата составления:");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_3.setBounds(213, 14, 98, 14);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(321, 11, 84, 20);
		contentPane.add(textField_2);
		
		JLabel label_1 = new JLabel("Сумма аванса:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_1.setBounds(10, 88, 73, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(93, 85, 109, 20);
		contentPane.add(textField_1);
		
		JButton button_2 = new JButton("Выйти из программы");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_2.setBounds(164, 148, 144, 23);
		contentPane.add(button_2);
	}
}
