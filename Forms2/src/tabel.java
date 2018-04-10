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
		setBounds(100, 100, 303, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(10, 65, 252, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Альметьев Афанасий Викторович");
		comboBox.addItem("Савельева Наталья Владимировна");
		
		textField = new JTextField();
		textField.setText("10.04.2018");
		textField.setBounds(176, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Дата:");
		label.setBounds(128, 14, 38, 14);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 123, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("Коэффициент эффективности:");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(10, 126, 173, 14);
		contentPane.add(label_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(146, 209, 130, -79);
		contentPane.add(desktopPane);
		
		JCheckBox checkBox = new JCheckBox("Явился на рабочее место");
		checkBox.setBounds(10, 92, 173, 23);
		contentPane.add(checkBox);
		
		JLabel label_2 = new JLabel("Сотрудник");
		label_2.setBounds(10, 40, 145, 14);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("Сохранить");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 164, 252, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Закрыть");
		btnNewButton_1.setBounds(173, 233, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
