package tiil.edu;
import java.util.Scanner;
public class Lab1Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập hệ số a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Nhập hệ số b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Nhập hệ số c: ");
	        double c = scanner.nextDouble();

	        double delta = Math.pow(b,2) - 4 * a * c;

	        if (delta >= 0) {
	            double canDelta = Math.sqrt(delta);
	            System.out.println("Căn delta là: " + canDelta);
	        } else {
	            System.out.println("Không thể tính căn delta vì delta < 0");
	        }
	        scanner.close();
	}

}
