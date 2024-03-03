package TH0_MayTinh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(41, 72, 88, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số b:");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSB.setBounds(41, 122, 88, 39);
		contentPane.add(lblNhpSB);
		
		txtA = new JTextField();
		txtA.setBounds(139, 83, 324, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(139, 133, 324, 20);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cong();
			}
			
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCong.setBounds(139, 191, 69, 39);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(218, 191, 69, 39);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNhan.setBounds(315, 191, 69, 39);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(394, 191, 69, 39);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả  :");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(41, 257, 88, 39);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(139, 268, 324, 20);
		contentPane.add(txtKQ);
	}
	
	void Cong() {
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		double soA = Double.parseDouble(str_A);
		double soB = Double.parseDouble(str_B);
		double tong = soA + soB;
		txtKQ.setText(String.valueOf(tong));
	}
	
	void Tru() {
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		double soA = Double.parseDouble(str_A);
		double soB = Double.parseDouble(str_B);
		double tong = soA - soB;
		txtKQ.setText(String.valueOf(tong));
	}
	
	void Nhan() {
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		double soA = Double.parseDouble(str_A);
		double soB = Double.parseDouble(str_B);
		double tong = soA * soB;
		txtKQ.setText(String.valueOf(tong));
	}
	
	void Chia() {
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		double soA = Double.parseDouble(str_A);
		double soB = Double.parseDouble(str_B);
		double tong = soA / soB;
		txtKQ.setText(String.valueOf(tong));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
