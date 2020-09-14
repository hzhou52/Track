import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class UI_Design {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Design window = new UI_Design();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI_Design() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(145, 26, 178, 22);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Racer Infomation:");
		lblNewLabel.setBounds(16, 26, 117, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To AZ Track");
		lblNewLabel_1.setBounds(154, 6, 136, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblYearOfCar = new JLabel("Year Of Car:");
		lblYearOfCar.setBounds(16, 53, 117, 22);
		frame.getContentPane().add(lblYearOfCar);
		
		JLabel lblMake = new JLabel("Make:");
		lblMake.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblMake.setBounds(16, 87, 117, 22);
		frame.getContentPane().add(lblMake);
		
		JLabel lblModel = new JLabel("Model:");
		lblModel.setBounds(16, 121, 117, 22);
		frame.getContentPane().add(lblModel);
		
		JLabel lblSpeed = new JLabel("Speed");
		lblSpeed.setBounds(16, 155, 117, 22);
		frame.getContentPane().add(lblSpeed);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(145, 53, 178, 22);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(145, 87, 178, 22);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(145, 121, 178, 22);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(145, 155, 178, 22);
		frame.getContentPane().add(panel_4);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(16, 186, 117, 22);
		frame.getContentPane().add(lblTime);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(145, 186, 178, 22);
		frame.getContentPane().add(panel_5);
		
		JLabel lblBestTime = new JLabel("React Time:");
		lblBestTime.setBounds(16, 220, 117, 22);
		frame.getContentPane().add(lblBestTime);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(145, 220, 178, 22);
		frame.getContentPane().add(panel_6);
	}
}
