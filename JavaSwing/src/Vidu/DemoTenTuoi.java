package Vidu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DemoTenTuoi {

	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setTitle("Vi du JFrame");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setLayout(new FlowLayout()); //--> btn2 ko đè lên btn1
		
		
		//tạo nút
		JButton btn1 = new JButton("press me");
		JButton btn2 = new JButton("dont press");
		// gắn lên form
		f.add(btn1);
		f.add(btn2); // khi chạy btn2 đè lên btn1 --> setLayout
		
		//tạo tai nghe
		BoLangNghe ok = new BoLangNghe();
		// gắn vào cho btn1
		btn1.addActionListener(ok);
		
		btn2.addActionListener(  new ActionListener() { // gọi hàm ẩn danh
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog();
				dialog.setTitle("inform something");
				dialog.setSize(220, 120);
				dialog.show();
			}
		});
		
		
		f.show();
	}
	private static class BoLangNghe implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// mã xử lí khi dùng click chuột ở đây
			JDialog dialog = new JDialog();
			dialog.setTitle("inform something");
			dialog.setSize(220, 120);
			dialog.show();
		}
	}

}
