import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JEditorPane;
import java.awt.Canvas;
import javax.swing.JToolBar;
import java.awt.TextField;
import javax.swing.SpringLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.Font;

public class Nalog extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nalog frame = new Nalog();
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
	public Nalog() {
		setTitle("Налоговые ставки");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("НДФЛ:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label.setBounds(28, 42, 37, 18);
		contentPane.add(label);
		
		TextField textField = new TextField();
		textField.setBounds(71, 42, 56, 18);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setText("13");
		contentPane.add(textField);
		
		JLabel label_13 = new JLabel("%");
		label_13.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_13.setBounds(133, 44, 11, 14);
		contentPane.add(label_13);
		
		JLabel label_1 = new JLabel("ПФР:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_1.setBounds(34, 67, 31, 17);
		contentPane.add(label_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(71, 66, 56, 18);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_1.setText("22");
		contentPane.add(textField_1);
		
		JLabel label_14 = new JLabel("%");
		label_14.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_14.setBounds(133, 68, 11, 14);
		contentPane.add(label_14);
		
		JLabel label_3 = new JLabel("ФФОМС:");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_3.setBounds(12, 90, 53, 18);
		contentPane.add(label_3);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(71, 90, 56, 18);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_2.setText("5.1");
		contentPane.add(textField_2);
		
		JLabel label_15 = new JLabel("%");
		label_15.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_15.setBounds(133, 92, 11, 14);
		contentPane.add(label_15);
		
		JLabel label_2 = new JLabel("ФСС:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_2.setBounds(34, 114, 31, 18);
		contentPane.add(label_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(71, 114, 56, 18);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_3.setText("2.9");
		contentPane.add(textField_3);
		
		JLabel label_16 = new JLabel("%");
		label_16.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_16.setBounds(133, 117, 11, 14);
		contentPane.add(label_16);
		
		JLabel label_4 = new JLabel("ФССНС:");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_4.setBounds(17, 136, 48, 18);
		contentPane.add(label_4);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(71, 136, 56, 18);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_4.setText("0.2");
		contentPane.add(textField_4);
		
		JLabel label_17 = new JLabel("%");
		label_17.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_17.setBounds(133, 138, 11, 14);
		contentPane.add(label_17);
		
		JButton btnNewButton = new JButton("Сохранить");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(12, 165, 264, 25);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("Загрузить значения из базы данных");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_1.setBounds(12, 11, 264, 25);
		contentPane.add(button_1);
		
		JButton button = new JButton("Выйти в меню");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(12, 201, 105, 23);
		contentPane.add(button);
		
		JButton button_2 = new JButton("Выйти из программы");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_2.setBounds(127, 201, 149, 23);
		contentPane.add(button_2);
	}
}
