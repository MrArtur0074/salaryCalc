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
		setTitle("Ставки налогообложения");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("НДФЛ:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label.setBounds(26, 10, 37, 18);
		contentPane.add(label);
		
		TextField textField = new TextField();
		textField.setBounds(69, 10, 56, 18);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setText("13");
		contentPane.add(textField);
		
		JLabel label_13 = new JLabel("%");
		label_13.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_13.setBounds(131, 12, 11, 14);
		contentPane.add(label_13);
		
		JLabel label_1 = new JLabel("ПФР:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_1.setBounds(32, 35, 31, 17);
		contentPane.add(label_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(69, 34, 56, 18);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_1.setText("22");
		contentPane.add(textField_1);
		
		JLabel label_14 = new JLabel("%");
		label_14.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_14.setBounds(131, 36, 11, 14);
		contentPane.add(label_14);
		
		JLabel label_3 = new JLabel("ФФОМС:");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_3.setBounds(10, 58, 53, 18);
		contentPane.add(label_3);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(69, 58, 56, 18);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_2.setText("5.1");
		contentPane.add(textField_2);
		
		JLabel label_15 = new JLabel("%");
		label_15.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_15.setBounds(131, 60, 11, 14);
		contentPane.add(label_15);
		
		JLabel label_2 = new JLabel("ФСС:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_2.setBounds(32, 82, 31, 18);
		contentPane.add(label_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(69, 82, 56, 18);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_3.setText("2.9");
		contentPane.add(textField_3);
		
		JLabel label_16 = new JLabel("%");
		label_16.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_16.setBounds(131, 85, 11, 14);
		contentPane.add(label_16);
		
		JLabel label_4 = new JLabel("ФССНС:");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_4.setBounds(15, 104, 48, 18);
		contentPane.add(label_4);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(69, 104, 56, 18);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_4.setText("0.2");
		contentPane.add(textField_4);
		
		JLabel label_17 = new JLabel("%");
		label_17.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_17.setBounds(131, 106, 11, 14);
		contentPane.add(label_17);
		
		JButton btnNewButton = new JButton("Сохранить");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 133, 264, 25);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Выйти в меню");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(10, 169, 105, 23);
		contentPane.add(button);
		
		JButton button_2 = new JButton("Выйти из программы");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_2.setBounds(125, 169, 149, 23);
		contentPane.add(button_2);
	}
}
