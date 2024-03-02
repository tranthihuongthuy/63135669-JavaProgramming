import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class GiaiPTB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaiPTB2 frame = new GiaiPTB2();
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
	public GiaiPTB2() {
		setTitle("Giải phương trình bậc 2 (ax^2 + bx + c =0)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtA.setBounds(174, 40, 236, 24);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JLabel SoA = new JLabel("Số a :");
		SoA.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		SoA.setBounds(63, 40, 101, 26);
		contentPane.add(SoA);
		
		JLabel SoB = new JLabel("Số b :");
		SoB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		SoB.setBounds(63, 92, 101, 26);
		contentPane.add(SoB);
		
		JLabel SoC = new JLabel("Số c :");
		SoC.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		SoC.setBounds(63, 141, 101, 26);
		contentPane.add(SoC);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(174, 94, 236, 24);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(174, 141, 236, 24);
		contentPane.add(txtC);
		
		JLabel lblNewLabel_1 = new JLabel("Kết Quả :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(63, 259, 73, 34);
		contentPane.add(lblNewLabel_1);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setEnabled(false);
		txtKetQua.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(174, 258, 294, 36);
		contentPane.add(txtKetQua);
		
		JButton btnTinhX = new JButton("Tính X");
		btnTinhX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyPTB2();
			}
		});
		btnTinhX.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTinhX.setBounds(63, 199, 85, 21);
		contentPane.add(btnTinhX);
	}
	void XuLyPTB2() {
		//Lấy dữ liệu
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		String Str_SoC = txtC.getText();
		//Chuyển kiểu
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		double SoC = Double.parseDouble(Str_SoC);
		//Tính toán
		if(SoA==0) {//bx + c = 0 => GiaiPTB1
				if(SoB==0)
					txtKetQua.setText("PT vô số nghiệm");
				else {
						double KQ = (-SoC)/SoB;
						txtKetQua.setText(String.valueOf(KQ));
				}
		}
		else {
				double Delta = SoB*SoB - 4*SoA*SoC;
				if(Delta<0)
						txtKetQua.setText("PT vô nghiệm");
				if(Delta==0) {
						double KQ = (-SoB)/(2*SoA);
						txtKetQua.setText("x1 = x2 = " + String.valueOf(KQ));
				}
				else {
						double KQ1 = (double) ((-SoB)+Math.sqrt(Delta))/(2*SoA);
						double KQ2 = (double) ((-SoB)-Math.sqrt(Delta))/(2*SoA);
						txtKetQua.setText("x1 = "+String.valueOf(KQ1) + "\tx2 = " + String.valueOf(KQ2));
					}
				}
				
	}
}
