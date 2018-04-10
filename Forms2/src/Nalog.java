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
		setBounds(100, 100, 243, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(12, 12, 63, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(79, 12, 87, 18);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(170, 12, 42, 18);
		contentPane.add(label_7);
		
		JLabel label = new JLabel("НДФЛ:");
		label.setBounds(41, 34, 34, 18);
		contentPane.add(label);
		
		TextField textField = new TextField();
		textField.setBounds(79, 34, 56, 18);
		textField.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		textField.setText("13");
		contentPane.add(textField);
		
		JLabel label_13 = new JLabel("%");
		label_13.setBounds(141, 36, 11, 14);
		contentPane.add(label_13);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(185, 34, 27, 28);
		contentPane.add(label_8);
		
		JLabel label_1 = new JLabel("ПФР:");
		label_1.setBounds(51, 67, 25, 17);
		contentPane.add(label_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(79, 66, 56, 18);
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		textField_1.setText("22");
		contentPane.add(textField_1);
		
		JLabel label_14 = new JLabel("%");
		label_14.setBounds(141, 68, 11, 14);
		contentPane.add(label_14);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(185, 66, 27, 29);
		contentPane.add(label_9);
		
		JLabel label_3 = new JLabel("ФФОМС:");
		label_3.setBounds(32, 99, 43, 18);
		contentPane.add(label_3);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(79, 99, 56, 18);
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		textField_2.setText("5.1");
		contentPane.add(textField_2);
		
		JLabel label_15 = new JLabel("%");
		label_15.setBounds(141, 101, 11, 14);
		contentPane.add(label_15);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(185, 99, 27, 32);
		contentPane.add(label_10);
		
		JLabel label_2 = new JLabel("ФСС:");
		label_2.setBounds(49, 128, 26, 30);
		contentPane.add(label_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(79, 135, 56, 18);
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 13));
		textField_3.setText("2.9");
		contentPane.add(textField_3);
		
		JLabel label_16 = new JLabel("%");
		label_16.setBounds(141, 136, 11, 14);
		contentPane.add(label_16);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(185, 135, 27, 30);
		contentPane.add(label_11);
		
		JLabel label_4 = new JLabel("ФССНС:");
		label_4.setBounds(35, 169, 40, 18);
		contentPane.add(label_4);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(79, 169, 56, 18);
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 13));
		textField_4.setText("0.2");
		contentPane.add(textField_4);
		
		JLabel label_17 = new JLabel("%");
		label_17.setBounds(141, 171, 11, 14);
		contentPane.add(label_17);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(185, 169, 27, 30);
		contentPane.add(label_12);
		
		JButton btnNewButton = new JButton("Сохранить");
		btnNewButton.setBounds(12, 203, 200, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Закрыть");
		button.setBounds(128, 245, 89, 23);
		contentPane.add(button);
	}
}
