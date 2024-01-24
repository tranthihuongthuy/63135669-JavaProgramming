package tiil.edu;
import java.util.Scanner;
public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        double theTich = Math.pow(canh, 3);

        System.out.print("Thể tích của khối lập phương là: " + theTich);

        scanner.close();
	}
}
