package tiil.edu;
import java.util.Scanner; 
public class Lab1Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài hình chữ nhật: ");
        double dai = scanner.nextDouble();
        System.out.print("Chiều rộng hình chữ nhật: ");
        double rong = scanner.nextDouble();
        
        double chuvi = (dai + rong) * 2;
        double dientich = dai * rong;
        double canhnhonhat = Math.min(dai, rong);
       
        System.out.println("Chu vi của hình chữ nhật là: " + chuvi);
        System.out.println("Diện tích hình chữ nhật là: " + dientich);
        System.out.println("Cạnh nhỏ nhất là: " + canhnhonhat);
        scanner.close();
	}
}
