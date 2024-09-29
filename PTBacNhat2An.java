import java.util.Scanner;

public class PTBacNhat2An {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a11: ");
        double a11 = scanner.nextDouble();

        System.out.print("Nhập hệ số a12: ");
        double a12 = scanner.nextDouble();

        System.out.print("Nhập hệ số b1: ");
        double b1 = scanner.nextDouble();

        System.out.print("Nhập hệ số a21: ");
        double a21 = scanner.nextDouble();

        System.out.print("Nhập hệ số a22: ");
        double a22 = scanner.nextDouble();

        System.out.print("Nhập hệ số b2: ");
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a12 * a21;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = Dx / D;
            double x2 = Dy / D;
            System.out.println("Hệ phương trình có nghiệm duy nhất:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (Dx == 0 && Dy == 0) {
            System.out.println("Hệ phương trình có vô số nghiệm.");
        } else {
            System.out.println("Hệ phương trình vô nghiệm.");
        }

        scanner.close();
    }
}
