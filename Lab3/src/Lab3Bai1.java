import java.util.Scanner;
public class Lab3Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int N = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (N <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không là số nguyên tố.");
        }
        scanner.close();

	}

}
