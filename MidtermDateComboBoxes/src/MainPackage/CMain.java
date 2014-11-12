package MainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CMain frame = new CMain();
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
	public CMain() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String string_date = dateFormat.format(date).toString();
		String year_date= string_date.substring(0, 4);
		String month_date= string_date.substring(5, 7);
		String day_date= string_date.substring(8);
		int month = Integer.parseInt(month_date);
		Integer year = Integer.parseInt(year_date);
		int day = Integer.parseInt(day_date);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(73, 59, 46, 14);
		contentPane.add(lblMonth);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(73, 107, 46, 14);
		contentPane.add(lblDay);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(73, 155, 46, 14);
		contentPane.add(lblYear);
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		JComboBox cb1 = new JComboBox(months);
		cb1.setSelectedItem(months[month-1]);
		cb1.setBounds(139, 56, 100, 20);
		contentPane.add(cb1);
		
		
		Integer[] days = new Integer[31];
		for (int x = 0; x < 31; x++){
			days[x] = x+1;
		}
		JComboBox cb2 = new JComboBox(days);
		cb2.setSelectedItem(days[day-1]);
		cb2.setBounds(139, 104, 100, 20);
		contentPane.add(cb2);
		
		Integer[] years = new Integer[11];
		for (int x = 0; x < 11; x++){
			if (x == 5) {
				years[x] = year;
			}
			else{
			years[x] = year+x-5;
			}
		}
		JComboBox cb3 = new JComboBox(years);
		cb3.setSelectedItem(year);
		cb3.setBounds(139, 152, 100, 20);
		contentPane.add(cb3);
		
	}
}
