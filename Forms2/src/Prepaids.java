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

public class Prepaids extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setBounds(100, 100, 431, 250);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(146, 209, 130, -79);
		contentPane.add(desktopPane);
		
		JButton btnNewButton = new JButton("Выйти в меню");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 177, 103, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Сохранить данные\r\n");
		button.setBounds(232, 111, 173, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Распечатать расписку");
		button_1.setBounds(232, 141, 173, 25);
		contentPane.add(button_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 11, 164, 42);
		contentPane.add(panel);
		
		JLabel label_3 = new JLabel("\u041D\u043E\u043C\u0435\u0440 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430:");
		label_3.setBounds(10, 17, 98, 14);
		panel.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 14, 36, 20);
		panel.add(textField_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(195, 11, 212, 42);
		contentPane.add(panel_1);
		
		JLabel label_4 = new JLabel("\u0414\u0430\u0442\u0430 \u0441\u043E\u0441\u0442\u0430\u0432\u043B\u0435\u043D\u0438\u044F:");
		label_4.setBounds(10, 14, 98, 14);
		panel_1.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118, 11, 84, 20);
		panel_1.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 111, 212, 55);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("Сумма аванса:");
		label_1.setBounds(10, 11, 73, 14);
		panel_2.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 8, 109, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 64, 395, 36);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_2 = new JLabel("Сотрудник:");
		label_2.setBounds(10, 11, 60, 14);
		panel_3.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(80, 8, 305, 20);
		panel_3.add(comboBox);
		comboBox.setToolTipText("");
		comboBox.addItem("Альметьев Афанасий Викторович");
		comboBox.addItem("Савельева Наталья Владимировна");
	}
}
