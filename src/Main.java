import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm bạn muốn kiểm tra: ");
        year = sc.nextInt();
        System.out.println((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "Là năm nhuận!" : "Không là năm nhuận!");
    }
}