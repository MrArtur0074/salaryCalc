import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

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
		setBounds(100, 100, 1280, 665);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 1244, 600);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 81, 1224, 438);
		panel.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		JTable table = new JTable(){
		       @Override
		       public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		           Component component = super.prepareRenderer(renderer, row, column);
		           int rendererWidth = component.getPreferredSize().width;
		           TableColumn tableColumn = getColumnModel().getColumn(column);
		           tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
		           return component;
		        }
		    };
		table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		scrollPane.setViewportView(table);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, "", null, null, null, "", "", "", "", ""},
			},
			new String[] {
				"\u041D\u043E\u043C\u0435\u0440 \u043F\u043E \u043F\u043E\u0440\u044F\u0434\u043A\u0443", "\u0422\u0430\u0431\u0435\u043B\u044C\u043D\u044B\u0439 \u043D\u043E\u043C\u0435\u0440", "\u0424\u0430\u043C\u0438\u043B\u0438\u044F, \u0438\u043D\u0438\u0446\u0438\u0430\u043B\u044B", "\u0414\u043E\u043B\u0436\u043D\u043E\u0441\u0442\u044C", "\u041E\u043A\u043B\u0430\u0434", "\u041E\u0442\u0440\u0430\u0431\u043E\u0442\u0430\u043D\u043E \u0431\u0443\u0434\u043D\u0435\u0439", "\u041E\u0442\u0440\u0430\u0431\u043E\u0442\u0430\u043D\u043E \u0432\u044B\u0445\u043E\u0434\u043D\u044B\u0445", "\u0417\u0430\u0440\u0430\u0431\u043E\u0442\u043D\u0430\u044F \u043F\u043B\u0430\u0442\u0430", "\u041F\u0440\u0435\u043C\u0438\u044F", "\u0412\u0441\u0435\u0433\u043E \u043D\u0430\u0447\u0438\u0441\u043B\u0435\u043D\u0438\u0439, \u0440\u0443\u0431.", "\u0423\u0434\u0435\u0440\u0436\u0430\u043D\u0438\u0435 - \u043D\u0430\u043B\u043E\u0433 \u043D\u0430 \u0434\u043E\u0445\u043E\u0434\u044B, \u0440\u0443\u0431.", "\u0423\u0434\u0435\u0440\u0436\u0430\u043D\u0438\u0435 \u0437\u0430 \u0430\u0432\u0430\u043D\u0441, \u0440\u0443\u0431.", "\u0412\u0441\u0435\u0433\u043E \u0443\u0434\u0435\u0440\u0436\u0430\u043D\u0438\u0439, \u0440\u0443\u0431.", "\u0418\u0442\u043E\u0433\u043E \u043A \u0432\u044B\u043F\u043B\u0430\u0442\u0435, \u0440\u0443\u0431"
			}
		));
		
		
		JButton button = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044C \u0434\u0430\u043D\u043D\u044B\u0435 \u0437\u0430 \u043E\u0442\u0447\u0435\u0442\u043D\u044B\u0439 \u043F\u0435\u0440\u0438\u043E\u0434");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(714, 11, 260, 25);
		panel.add(button);
		
		JButton button_1 = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044C \u0433\u043E\u0442\u043E\u0432\u0443\u044E \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u0443\u044E \u0432\u0435\u0434\u043E\u043C\u043E\u0441\u0442\u044C");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_1.setBounds(714, 45, 260, 25);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u041F\u0435\u0440\u0435\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_2.setBounds(10, 530, 134, 25);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\u041F\u0440\u043E\u0441\u043C\u043E\u0442\u0440 \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u043E\u0439 \u0432\u0435\u0434\u043E\u043C\u043E\u0441\u0442\u0438");
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_3.setBounds(154, 530, 215, 25);
		panel.add(button_3);
		
		JButton button_4 = new JButton("\u0420\u0430\u0441\u043F\u0435\u0447\u0430\u0442\u0430\u0442\u044C \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u0443\u044E \u0432\u0435\u0434\u043E\u043C\u043E\u0441\u0442\u044C");
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_4.setBounds(724, 530, 250, 25);
		panel.add(button_4);
		
		JButton button_5 = new JButton("\u0420\u0430\u0441\u043F\u0435\u0447\u0430\u0442\u0430\u0442\u044C \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u044B\u0435 \u043B\u0438\u0441\u0442\u044B");
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_5.setBounds(724, 566, 250, 25);
		panel.add(button_5);
		
		JButton button_6 = new JButton("\u0421\u0444\u043E\u0440\u043C\u0438\u0440\u043E\u0432\u0430\u0442\u044C \u0437\u0430\u043F\u0440\u043E\u0441 \u0432 \u0431\u0430\u043D\u043A");
		button_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_6.setBounds(984, 530, 250, 25);
		panel.add(button_6);
		
		JButton button_7 = new JButton("\u0412\u044B\u0439\u0442\u0438 \u0432 \u043C\u0435\u043D\u044E");
		button_7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_7.setBounds(1084, 11, 150, 23);
		panel.add(button_7);
		
		JButton button_8 = new JButton("\u041E\u0442\u043F\u0440\u0430\u0432\u0438\u0442\u044C \u0432\u0435\u0434\u043E\u043C\u043E\u0441\u0442\u044C \u043D\u0430 \u0443\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043D\u0438\u0435");
		button_8.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_8.setBounds(379, 530, 250, 25);
		panel.add(button_8);
		
		JButton button_9 = new JButton("\u041F\u0440\u043E\u0441\u043C\u043E\u0442\u0440 \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u043E\u0433\u043E \u043B\u0438\u0441\u0442\u0430");
		button_9.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_9.setBounds(154, 566, 475, 25);
		panel.add(button_9);
		
		JLabel label = new JLabel("\u041D\u043E\u043C\u0435\u0440 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label.setBounds(10, 14, 98, 14);
		panel.add(label);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(118, 11, 35, 20);
		panel.add(textField_3);
		
		JLabel label_1 = new JLabel("\u0414\u0430\u0442\u0430 \u0441\u043E\u0441\u0442\u0430\u0432\u043B\u0435\u043D\u0438\u044F:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_1.setBounds(163, 14, 98, 14);
		panel.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(271, 11, 100, 20);
		panel.add(textField_4);
		
		JLabel label_2 = new JLabel("\u0441:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_2.setBounds(379, 34, 9, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u041E\u0442\u0447\u0435\u0442\u043D\u044B\u0439 \u043F\u0435\u0440\u0438\u043E\u0434");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(379, 11, 260, 14);
		panel.add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(395, 28, 100, 20);
		panel.add(textField_5);
		
		JLabel label_4 = new JLabel("\u043F\u043E:");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_4.setBounds(515, 34, 16, 14);
		panel.add(label_4);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(539, 28, 100, 20);
		panel.add(textField_6);
		
		JButton button_10 = new JButton("\u0412\u044B\u0447\u0442\u0438 \u0438\u0437 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u044B");
		button_10.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_10.setBounds(1084, 46, 150, 23);
		panel.add(button_10);
		
	}
}
