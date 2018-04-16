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

public class tabel extends JFrame {

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
					tabel frame = new tabel();
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
	public tabel() {
		setTitle("Учет рабочего времени");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setToolTipText("");
		comboBox.setBounds(6, 65, 284, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Альметьев Афанасий Викторович");
		comboBox.addItem("Савельева Наталья Владимировна");
		comboBox.addItem("Григорьев Николай Александрович");
		comboBox.addItem("Максимова Елизавета Петровна");
		comboBox.addItem("Калинин Василий Петрович");
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setText("10.04.2018");
		textField.setBounds(46, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Дата:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label.setBounds(10, 14, 26, 14);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_1.setBounds(173, 123, 38, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("Коэффициент эффективности:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(10, 126, 152, 14);
		contentPane.add(label_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(146, 209, 130, -79);
		contentPane.add(desktopPane);
		
		JCheckBox checkBox = new JCheckBox("Явился на рабочее место");
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		checkBox.setBounds(10, 92, 240, 23);
		contentPane.add(checkBox);
		
		JLabel label_2 = new JLabel("Сотрудник");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_2.setBounds(10, 40, 63, 14);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("Сохранить");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 164, 284, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Выйти в меню");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBounds(10, 198, 130, 23);
		contentPane.add(btnNewButton_1);
		
		JButton button_1 = new JButton("Выйти из программы");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_1.setBounds(146, 198, 144, 23);
		contentPane.add(button_1);
	}
}
