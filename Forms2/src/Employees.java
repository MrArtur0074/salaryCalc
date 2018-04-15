import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.ScrollPane;
import java.awt.Point;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;

public class Employees extends JFrame {

	private JPanel contentPane;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employees frame = new Employees();
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
	public Employees() {
		setTitle("Данные о сотрудниках");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 61, 581, 149);
		contentPane.add(scrollPane);
		
				
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
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "1", "Альметьев Афанасий Викторович", "Директор", "63000", "42307810590380710235"},
				{"2", "2", "Савельева Наталья Владимировна", "Бухгалтер", "25000", "59637810590380710237"},
				{"3", "2", "Григорьев Николай Александрович", "Главный бухгалтер", "30000", "89407810590380710277"},
				{"4", "5", "Максимова Елизавета Петровна", "Начальник склада", "25000", "36597810590380710475"},
				{"5", "6", "Калинин Василий Петрович", "Начальник цеха", "35000", "85634810590380710967"},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Табельный №", "№ отдела", "ФИО", "Должность", "Оклад", "Банковский счет"
			}
		));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JButton button = new JButton("Загрузить из базы данных");
		button.setBounds(10, 11, 227, 39);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Сохранить");
		button_1.setBounds(10, 226, 227, 38);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Закрыть");
		button_2.setBounds(492, 241, 99, 23);
		contentPane.add(button_2);
		
		
	}
}
