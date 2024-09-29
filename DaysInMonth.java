import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> monthDays = new HashMap<>();
        monthDays.put("January", 31);
        monthDays.put("February", 28);
        monthDays.put("March", 31);
        monthDays.put("April", 30);
        monthDays.put("May", 31);
        monthDays.put("June", 30);
        monthDays.put("July", 31);
        monthDays.put("August", 31);
        monthDays.put("September", 30);
        monthDays.put("October", 31);
        monthDays.put("November", 30);
        monthDays.put("December", 31);

        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String[] monthAbbreviations = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        while (true) {

            System.out.print("Nhập tên tháng (hoặc viết tắt 3 chữ): ");
            String monthInput = scanner.nextLine().trim();

            System.out.print("Nhập năm: ");
            int year;
            while (true) {
                try {
                    year = Integer.parseInt(scanner.nextLine());
                    if (year < 0) {
                        throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Năm không hợp lệ. Vui lòng nhập lại: ");
                }
            }


            String month = monthInput.substring(0, 1).toUpperCase() + monthInput.substring(1).toLowerCase();


            if (monthDays.containsKey(month)) {
                if (isLeapYear(year)) {
                    monthDays.put("February", 29);
                }

                System.out.println("Số ngày trong " + month + " " + year + " là: " + monthDays.get(month));

                monthDays.put("February", 28);
                break;
            } else {
                boolean validMonth = false;
                for (int i = 0; i < monthNames.length; i++) {
                    if (month.equals(monthAbbreviations[i]) || String.valueOf(i + 1).equals(monthInput)) {
                        month = monthNames[i];
                        validMonth = true;
                        break;
                    }
                }

                if (!validMonth) {
                    System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
                } else {

                    System.out.println("Số ngày trong " + month + " " + year + " là: " + monthDays.get(month));
                    break;
                }
            }
        }

        scanner.close();
    }


    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
