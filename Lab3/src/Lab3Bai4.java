import java.util.Scanner;
public class Lab3Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        // Khai báo mảng lưu họ tên sinh viên
        String[] names = new String[n];
        // Khai báo mảng lưu điểm sinh viên
        double[] scores = new double[n];
        
        // Nhập thông tin của từng sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin của sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            names[i] = scanner.nextLine();
            System.out.print("Điểm: ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        
        // Xuất thông tin của các sinh viên
        System.out.println("Thông tin của các sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + calculateGrade(scores[i]));
            System.out.println();
        }
        
        // Sắp xếp danh sách sinh viên theo điểm tăng dần
        sortStudents(names, scores);
        
        // Xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println();
        }
        
        scanner.close();
    }
    
    // Phương thức tính học lực của sinh viên
    public static String calculateGrade(double score) {
        if (score < 5) {
            return "Yếu";
        } else if (score < 6.5) {
            return "Trung bình";
        } else if (score < 7.5) {
            return "Khá";
        } else if (score < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
    
    // Phương thức sắp xếp danh sách sinh viên theo điểm tăng dần
    public static void sortStudents(String[] names, double[] scores) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] > scores[j]) {
                    // Hoán đổi vị trí của các phần tử
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                    
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;
                }
            }
        }

	}

}
