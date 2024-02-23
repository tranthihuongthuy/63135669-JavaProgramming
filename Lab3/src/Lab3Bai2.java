import java.util.Scanner;
public class Lab3Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên từ 1 đến 10 để chọn bảng cửu chương: ");
        int table = scanner.nextInt();
        
        if (table < 1 || table > 10) {
            System.out.println("Số bạn nhập không hợp lệ.");
        } else {
            // Xuất bảng cửu chương tương ứng với số được chọn
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", table, i, table * i);
            }
        }
        
        scanner.close();

	}

}
