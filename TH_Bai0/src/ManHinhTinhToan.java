import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(65, 57, 138, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpSTh.setBounds(65, 117, 138, 50);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtA.setBounds(213, 62, 310, 40);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(213, 122, 310, 38);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xử lý cộng
				//Viết lệnh xử lý ở một thủ tục/hàm
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCong.setBounds(94, 208, 85, 38);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xử lý trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTru.setBounds(213, 208, 85, 38);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xử lý nhân
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNhan.setBounds(320, 208, 85, 38);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xử lý chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnChia.setBounds(438, 208, 85, 38);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết Quả Tính Toán :");
		lblKtQuTnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(65, 287, 138, 50);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEnabled(false);
		txtKetQua.setBounds(213, 289, 310, 50);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}//hết hàm tạo
	void HamXuLyCong() {
		//Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//chuyen kieu
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		//Tinh toan
		double tong = soA + soB;
		//dua ra hien thi len dieu khien
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//chuyen kieu
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		//Tinh toan
		double hieu = soA - soB;
		//dua ra hien thi len dieu khien
		txtKetQua.setText(String.valueOf(hieu));
	}
	void HamXuLyNhan() {
		//Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//chuyen kieu
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		//Tinh toan
		double nhan = soA * soB;
		//dua ra hien thi len dieu khien
		txtKetQua.setText(String.valueOf(nhan));
	}
	void HamXuLyChia() {
		//Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//chuyen kieu
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		//Tinh toan
		double chia = 0.0;
		if(soB != 0) {
			chia = soA / soB;
		}
		else {
			chia = 0;
		}
		//dua ra hien thi len dieu khien
		txtKetQua.setText(String.valueOf(chia));
	}
}
