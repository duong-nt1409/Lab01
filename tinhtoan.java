import java.util.Scanner;

public class tinhtoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số thứ 1 ");
        double n1 = sc.nextDouble();

        System.out.println("Nhập số thứ 2 ");
        double n2 = sc.nextDouble();

        double sum = n1 + n2;
        double diff = n1 - n2;
        double tich = n1 * n2;
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + diff);
        System.out.println("Tích: " + tich);
        if (n2 != 0) {
            double thuong = n1/n2;
            System.out.println("Thương: " + thuong);
        } else {
            System.out.println("Không thể chia cho 0.");
        }
    }
}