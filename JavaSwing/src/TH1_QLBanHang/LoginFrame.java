package TH1_QLBanHang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;

	public LoginFrame() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(22, 57, 94, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMtKhu.setBounds(22, 112, 94, 29);
		contentPane.add(lblMtKhu);
		
		txtUser = new JTextField();
		txtUser.setBounds(137, 62, 227, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(137, 117, 227, 20);
		contentPane.add(txtPass);
		
		JButton btnLog = new JButton("Đăng nhập");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DangNhap();
			}
		});
		btnLog.setBounds(137, 160, 122, 23);
		contentPane.add(btnLog);
	}
	 void DangNhap() {
		 String strTen = txtUser.getText();
		 String strPass = txtPass.getText();
		 if (strTen.equals("63CNTT") && strPass.equals("123")) {
			 HomeFrame home = new HomeFrame();
			 home.setVisible(true);
			 this.setVisible(false);
		 }
		 else {
			 txtUser.setText("");
			 txtPass.setText("");
			 JOptionPane mess = new JOptionPane();
			 mess.showMessageDialog(this, "Đăng nhập thất bại" );
		 }
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
