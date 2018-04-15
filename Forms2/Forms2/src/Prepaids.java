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
	private JTextField textField;
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
		setBounds(100, 100, 374, 180);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(89, 11, 261, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Альметьев Афанасий Викторович");
		comboBox.addItem("Савельева Наталья Владимировна");
		
		textField = new JTextField();
		textField.setBounds(89, 35, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Дата выдачи:");
		label.setBounds(10, 38, 72, 14);
		contentPane.add(label);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(146, 209, 130, -79);
		contentPane.add(desktopPane);
		
		JLabel label_2 = new JLabel("Сотрудник:");
		label_2.setBounds(10, 14, 69, 14);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("Выйти в меню");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(127, 100, 103, 23);
		contentPane.add(btnNewButton);
		
		JLabel label_1 = new JLabel("Сумма аванса:");
		label_1.setBounds(185, 39, 86, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(264, 35, 86, 20);
		contentPane.add(textField_1);
		
		JButton button = new JButton("Сохранить запись");
		button.setBounds(10, 66, 165, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Распечатать расписку");
		button_1.setBounds(195, 66, 155, 23);
		contentPane.add(button_1);
	}
}
