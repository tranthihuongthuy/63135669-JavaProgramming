import java.util.Scanner;
public class Lab2Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int luaChon;
        do {
            menu();
            System.out.print("Chọn chức năng: ");
            luaChon = scanner.nextInt();

            // Gọi các chức năng tương ứng
            switch (luaChon) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc ứng dụng.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (luaChon != 4);
        scanner.close();
    }

    // Phương thức hiển thị menu
    public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }

    // Phương thức giải phương trình bậc nhất
    public static void giaiPTB1() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
        System.out.println("Đây là chức năng giải phương trình bậc nhất");
    }

    // Phương thức giải phương trình bậc 2
    public static void giaiPTB2() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là: " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiệm kép của phương trình là: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm thứ nhất của phương trình là: " + x1);
                System.out.println("Nghiệm thứ hai của phương trình là: " + x2);
            }
            System.out.println("Đây là chức năng giải phương trình bậc 2");
        }
    }

    // Phương thức tính tiền điện
    public static void tinhTienDien() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        int giaDuoi50 = 1000;
        int giaTren50 = 1200;

        int tien;

        if (soDien <= 50) {
            tien = soDien * giaDuoi50;
        } else {
            tien = 50 * giaDuoi50 + (soDien - 50) * giaTren50;
        }

        System.out.println("Tiền điện là: " + tien + " VND");
        System.out.println("Đây là chức năng tính tiền điện");
    }
}
