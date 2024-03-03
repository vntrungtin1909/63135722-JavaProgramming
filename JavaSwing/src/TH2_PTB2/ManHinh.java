package TH2_PTB2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ManHinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;

	public ManHinh() {
		setTitle("Giải phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập c");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(20, 81, 77, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập a");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhpB.setBounds(20, 41, 77, 29);
		contentPane.add(lblNhpB);
		
		JLabel lblNhpB_1 = new JLabel("Nhập b");
		lblNhpB_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhpB_1.setBounds(220, 41, 77, 29);
		contentPane.add(lblNhpB_1);
		
		txtA = new JTextField();
		txtA.setBounds(107, 46, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(307, 46, 86, 20);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(107, 86, 86, 20);
		contentPane.add(txtC);
		
		JButton btnSolve = new JButton("Thực hiện giải");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Giai();
			}
		});
		btnSolve.setBounds(220, 85, 173, 23);
		contentPane.add(btnSolve);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblKtQu.setBounds(20, 124, 77, 29);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setHorizontalAlignment(SwingConstants.LEFT);
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(107, 129, 286, 63);
		contentPane.add(txtKQ);
	}
	
	void Giai() {
		String strA = txtA.getText();
		double soA = Double.parseDouble(strA);
		String strB = txtB.getText();
		double soB = Double.parseDouble(strB);
		String strC = txtC.getText();
		double soC = Double.parseDouble(strC);
		if (soA == 0) {
			if (soB == 0) {
				if (soC == 0)
				txtKQ.setText("phương trình vô số nghiệm");
				else txtKQ.setText("Phương trình vô nghiệm");
			}
			else txtKQ.setText(String.valueOf(- soB / soC));
		}
		else {
			double delta = (Math.pow(soB, 2) - 4 * soA * soC);
			if (delta < 0) txtKQ.setText("phương trình vô nghiệm");
			else if (delta == 0) txtKQ.setText("Phương trình có 1 nghiệm kép " + String.valueOf(- soB / (2 * soA)));
			else txtKQ.setText("Phương trình có 2 nghiệm phân biệt \n" + String.valueOf((-soB + Math.sqrt(delta)) / (2 * soA)) + " \n" + String.valueOf((-soB - Math.sqrt(delta) / (2 * soA)))) ;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
