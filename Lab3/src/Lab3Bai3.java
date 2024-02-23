import java.util.Arrays;
import java.util.Scanner;
public class Lab3Bai3 {

	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   // Nhập số lượng phần tử của mảng
       System.out.print("Nhập số lượng phần tử của mảng: ");
       int n = scanner.nextInt();
       
       // Khai báo mảng có kích thước n
       int[] arr = new int[n];
       
       // Nhập các phần tử của mảng từ bàn phím
       System.out.println("Nhập các phần tử của mảng:");
       for (int i = 0; i < n; i++) {
           System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
           arr[i] = scanner.nextInt();
       }
       
       // Sắp xếp mảng
       Arrays.sort(arr);
       
       // Xuất mảng đã sắp xếp ra màn hình
       System.out.println("Mảng sau khi sắp xếp:");
       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
       
       // Phần tử nhỏ nhất của mảng
       int min = arr[0];
       for (int i = 1; i < n; i++) {
           min = Math.min(min, arr[i]);
       }
       System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
       
       // Trung bình cộng các phần tử chia hết cho 3
       int sum = 0;
       int count = 0;
       for (int i = 0; i < n; i++) {
           if (arr[i] % 3 == 0) {
               sum += arr[i];
               count++;
           }
       }
       double average = (double) sum / count;
       System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + average);
       
       scanner.close();

	}

}
