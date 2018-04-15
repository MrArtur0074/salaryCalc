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
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;

public class Approval_choice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Approval_choice frame = new Approval_choice();
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
	public Approval_choice() {
		setTitle("Работа с авансами");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 273);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 479, 212);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Документы, требующие утверждения");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 11, 410, 14);
		panel.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 459, 98);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Проект премиальных коэффициентов [от 04.04.2018 17:57:00] - ожидает утверждения", "Расчетная ведомость [от 04.04.2018 14:25:44] - ожидает утверждения"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JButton button = new JButton("Просмотр документа");
		button.setBounds(10, 145, 169, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Выйти в меню");
		button_1.setBounds(10, 179, 136, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Утвердить");
		button_2.setBounds(189, 145, 134, 23);
		panel.add(button_2);
	}
}
