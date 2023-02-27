import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class POS_Main extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					POS_Main dialog = new POS_Main();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public POS_Main() {
		setBounds(100, 100, 400, 500);
		getContentPane().setLayout(null);
		
		JButton btnSell = new JButton("판매");
		btnSell.setBounds(39, 279, 143, 62);
		getContentPane().add(btnSell);
		
		JButton btnNewButton_1 = new JButton("매출 관리");
		btnNewButton_1.setBounds(196, 351, 143, 62);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("메뉴 관리");
		btnNewButton_2.setBounds(39, 351, 143, 62);
		getContentPane().add(btnNewButton_2);
		
		JButton btnMenu = new JButton("판매 내역");
		btnMenu.setBounds(196, 279, 143, 62);
		getContentPane().add(btnMenu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(POS_Main.class.getResource("/img/pos.png")));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 99));
		lblNewLabel.setBounds(39, 19, 300, 250);
		getContentPane().add(lblNewLabel);

	}
}
