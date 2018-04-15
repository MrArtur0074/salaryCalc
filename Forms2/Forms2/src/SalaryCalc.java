import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SalaryCalc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalaryCalc frame = new SalaryCalc();
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
	public SalaryCalc() {
		setTitle("Расчет заработной платы");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 630);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 1244, 572);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 81, 1224, 438);
		panel.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, "", null, null, null, "34563", "3456", "3456", "3734", "567567"},
			},
			new String[] {
				"\u041D\u043E\u043C\u0435\u0440 \u043F\u043E \u043F\u043E\u0440\u044F\u0434\u043A\u0443", "\u0422\u0430\u0431\u0435\u043B\u044C\u043D\u044B\u0439 \u043D\u043E\u043C\u0435\u0440", "\u0424\u0430\u043C\u0438\u043B\u0438\u044F, \u0438\u043D\u0438\u0446\u0438\u0430\u043B\u044B", "\u0414\u043E\u043B\u0436\u043D\u043E\u0441\u0442\u044C", "\u041E\u043A\u043B\u0430\u0434", "\u041E\u0442\u0440\u0430\u0431\u043E\u0442\u0430\u043D\u043E \u0431\u0443\u0434\u043D\u0435\u0439", "\u041E\u0442\u0440\u0430\u0431\u043E\u0442\u0430\u043D\u043E \u0432\u044B\u0445\u043E\u0434\u043D\u044B\u0445", "\u0417\u0430\u0440\u0430\u0431\u043E\u0442\u043D\u0430\u044F \u043F\u043B\u0430\u0442\u0430", "\u041F\u0440\u0435\u043C\u0438\u044F", "\u0412\u0441\u0435\u0433\u043E", "\u041D\u0430\u043B\u043E\u0433 \u043D\u0430 \u0434\u043E\u0445\u043E\u0434\u044B", "\u0410\u0432\u0430\u043D\u0441", "\u0412\u0441\u0435\u0433\u043E", "\u041A \u0432\u044B\u043F\u043B\u0430\u0442\u0435"
			}
		));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(424, 11, 280, 59);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_3 = new JLabel("\u0441:");
		label_3.setBounds(10, 34, 9, 14);
		panel_1.add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(170, 28, 100, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(26, 28, 100, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_4 = new JLabel("\u043F\u043E:");
		label_4.setBounds(146, 34, 16, 14);
		panel_1.add(label_4);
		
		JLabel label_2 = new JLabel("\u041E\u0442\u0447\u0435\u0442\u043D\u044B\u0439 \u043F\u0435\u0440\u0438\u043E\u0434");
		label_2.setBounds(10, 11, 260, 14);
		panel_1.add(label_2);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 164, 42);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("\u041D\u043E\u043C\u0435\u0440 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430:");
		label.setBounds(10, 17, 98, 14);
		panel_2.add(label);
		
		textField_3 = new JTextField();
		textField_3.setBounds(118, 14, 35, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(184, 11, 230, 42);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_1 = new JLabel("\u0414\u0430\u0442\u0430 \u0441\u043E\u0441\u0442\u0430\u0432\u043B\u0435\u043D\u0438\u044F:");
		label_1.setBounds(10, 14, 98, 14);
		panel_3.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(118, 11, 100, 20);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044C \u0434\u0430\u043D\u043D\u044B\u0435 \u0437\u0430 \u043E\u0442\u0447\u0435\u0442\u043D\u044B\u0439 \u043F\u0435\u0440\u0438\u043E\u0434");
		button.setBounds(714, 11, 250, 25);
		panel.add(button);
		
		JButton button_1 = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044C \u0433\u043E\u0442\u043E\u0432\u0443\u044E \u0432\u0435\u0434\u043E\u043C\u043E\u0441\u0442\u044C");
		button_1.setBounds(714, 45, 250, 25);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u041F\u0435\u0440\u0435\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		button_2.setBounds(10, 530, 184, 25);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\u0421\u0444\u043E\u0440\u043C\u0438\u0440\u043E\u0432\u0430\u0442\u044C \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u0443\u044E \u0432\u0435\u0434\u043E\u043C\u043E\u0441\u0442\u044C\r\n");
		button_3.setBounds(204, 530, 250, 25);
		panel.add(button_3);
		
		JButton button_4 = new JButton("\u0420\u0430\u0441\u043F\u0435\u0447\u0430\u0442\u0430\u0442\u044C \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u0443\u044E \u0432\u0435\u0434\u043E\u043C\u043E\u0441\u0442\u044C");
		button_4.setBounds(464, 530, 250, 25);
		panel.add(button_4);
		
		JButton button_5 = new JButton("\u0420\u0430\u0441\u043F\u0435\u0447\u0430\u0442\u0430\u0442\u044C \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u044B\u0435 \u043B\u0438\u0441\u0442\u044B");
		button_5.setBounds(724, 530, 250, 25);
		panel.add(button_5);
		
		JButton button_6 = new JButton("\u0421\u0444\u043E\u0440\u043C\u0438\u0440\u043E\u0432\u0430\u0442\u044C \u0437\u0430\u043F\u0440\u043E\u0441 \u0432 \u0431\u0430\u043D\u043A");
		button_6.setBounds(984, 530, 250, 25);
		panel.add(button_6);
		
		JButton button_7 = new JButton("\u0412\u044B\u0439\u0442\u0438 \u0432 \u043C\u0435\u043D\u044E");
		button_7.setBounds(1084, 11, 150, 23);
		panel.add(button_7);
		table.getColumnModel().getColumn(0).setPreferredWidth(105);
		table.getColumnModel().getColumn(0).setMinWidth(105);
		table.getColumnModel().getColumn(1).setPreferredWidth(105);
		table.getColumnModel().getColumn(1).setMinWidth(105);
		table.getColumnModel().getColumn(2).setPreferredWidth(125);
		table.getColumnModel().getColumn(2).setMinWidth(125);
		table.getColumnModel().getColumn(3).setPreferredWidth(125);
		table.getColumnModel().getColumn(3).setMinWidth(125);
		table.getColumnModel().getColumn(4).setPreferredWidth(105);
		table.getColumnModel().getColumn(4).setMinWidth(105);
		table.getColumnModel().getColumn(5).setPreferredWidth(115);
		table.getColumnModel().getColumn(5).setMinWidth(115);
		table.getColumnModel().getColumn(6).setPreferredWidth(130);
		table.getColumnModel().getColumn(6).setMinWidth(130);
		table.getColumnModel().getColumn(7).setPreferredWidth(105);
		table.getColumnModel().getColumn(7).setMinWidth(105);
		table.getColumnModel().getColumn(8).setPreferredWidth(105);
		table.getColumnModel().getColumn(8).setMinWidth(105);
		table.getColumnModel().getColumn(9).setPreferredWidth(125);
		table.getColumnModel().getColumn(9).setMinWidth(125);
		table.getColumnModel().getColumn(10).setPreferredWidth(105);
		table.getColumnModel().getColumn(10).setMinWidth(105);
		table.getColumnModel().getColumn(11).setPreferredWidth(105);
		table.getColumnModel().getColumn(11).setMinWidth(105);
		table.getColumnModel().getColumn(12).setPreferredWidth(125);
		table.getColumnModel().getColumn(12).setMinWidth(125);
		table.getColumnModel().getColumn(13).setPreferredWidth(125);
		table.getColumnModel().getColumn(13).setMinWidth(125);
		
	}
}
