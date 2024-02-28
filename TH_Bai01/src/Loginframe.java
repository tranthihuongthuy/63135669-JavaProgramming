import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class Loginframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTen;
	private JPasswordField txtMatKhau;

	public Loginframe() {
		setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 43, 146, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU");
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMtKhu.setBounds(30, 90, 146, 33);
		contentPane.add(lblMtKhu);
		
		txtTen = new JTextField();
		txtTen.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTen.setBounds(186, 43, 227, 33);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(186, 91, 227, 33);
		contentPane.add(txtMatKhau);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDangNhap.setBounds(176, 171, 140, 41);
		contentPane.add(btnDangNhap);
	}
	void XuLyDangNhap() {
		//Lay ve ten dang nhap va mat khau
		String strTen = txtTen.getText();
		String strMK = txtMatKhau.getText();
		//Xu ly
		if(strTen.equals("63CNTT") && strMK.equals("123")) {
			//hien trang chu
			Mainframe homePage = new Mainframe();
			homePage.setVisible(true);
			//ẩn form đăng nhập
			this.setVisible(false);
		}else {//bao loi
			txtTen.setText("");
			txtMatKhau.setText("");
			//hien thong bao
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this,"Đăng nhập thất bại");
		}
	}
}
